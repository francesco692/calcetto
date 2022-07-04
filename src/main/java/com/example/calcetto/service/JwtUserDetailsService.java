package com.example.calcetto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    TbUtenteService service;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String password = service.getPasswordByUser(username);
        return new User(username, password,
                new ArrayList<>());
    }


}

