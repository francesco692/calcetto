package com.example.calcetto.controller;

import com.example.calcetto.config.JwtTokenUtil;
import com.example.calcetto.model.JwtRequest;
import com.example.calcetto.model.ResponseLogIn;
import com.example.calcetto.model.TbUtente;
import com.example.calcetto.service.JwtUserDetailsService;
import com.example.calcetto.service.TbUtenteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "https://icr.infordata.net", maxAge = 3600)
@CrossOrigin
public class JwtAuthenticationController extends BaseLogInController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private JwtUserDetailsService userDetailsService;

    @Autowired
    private TbUtenteService service;

    private static final Logger logger = LoggerFactory.getLogger("Authenticate GEMMA");

    @PostMapping("/authenticate")
    public ResponseEntity<ResponseLogIn> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest)
            throws Exception {

        logger.info("Autenticazione in corso : " + authenticationRequest.getNome());

        ResponseLogIn response = new ResponseLogIn();
        TbUtente user = null;

        try {
            user = authenticate(authenticationRequest.getNome(), authenticationRequest.getPassword());

            if(user != null) {
                logger.info("Ruolo dell'utente " + authenticationRequest.getNome());
            }else {
                logger.info(authenticationRequest.getNome() + " : autenticazione fallita \n");
            }

            final UserDetails userDetails = userDetailsService.loadUserByUsername(user.getNome());
            final String token = jwtTokenUtil.generateToken(userDetails);
            response = setResponse(response, user, token, "Log in avvenuto con successo \n");

            logger.info(authenticationRequest.getNome() + " : Log in avvenuto con successo  \n");

        } catch (Exception e) {
            logger.info(authenticationRequest.getNome() + " : autenticazione fallita  \n");
            response = setResponseError(response, e);
        }

        return new ResponseEntity<ResponseLogIn>(response, new HttpHeaders(), HttpStatus.OK);

    }

    private TbUtente authenticate(String nome, String password) throws Exception {

        TbUtente user = null;

        try {
            user = service.logIn(nome, password);
        } catch (Exception e) {
            throw new Exception(e);
        }

        return user;
/*
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
*/
    }


}
