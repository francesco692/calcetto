package com.example.calcetto.controller;

import com.example.calcetto.model.ResponseDTO;
import com.example.calcetto.model.TbAttivita;
import com.example.calcetto.model.TbGestore;
import com.example.calcetto.model.TbUtente;
import com.example.calcetto.service.TbUtenteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/utente")
public class UtenteController extends BaseController
{

    @Autowired
    TbUtenteService service;

    @PostMapping("/insertUtente")
    @ApiOperation(value = "aggiunta o modifica di una riga sulla tabella utente", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> save(@RequestBody TbUtente data) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            TbUtente result = service.save(data);
            response = setResponse(response, result, "dati salvati correttamente");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
    @PostMapping("/delete")
    @ApiOperation(value = "eliminazione di un elemento dalla tabella utente", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> deleteUtente(@RequestBody Map<String,Long> body) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            TbUtente result = service.deleteUtente(body.get("utenteId"));
            response = setResponse(response, result, "dati eliminati con successo");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
    @PostMapping("/ricercaPerCitta")
    @ApiOperation(value = "ricerca per citta sulla tabella gestore", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> localita(@RequestBody Map<String,String> body) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            List<TbGestore> result = service.localita(body.get("citta"));
            response = setResponse(response, result, "");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
    @PostMapping("/cercaPerPrezzo")
    @ApiOperation(value = "ricerca per prezzo sulla tabella gestore", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> findByPrezzo(@RequestBody Map<String,String> body) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            List<TbAttivita> result = service.findByPrezzo(body.get("prezzo"));
            response = setResponse(response, result, "");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
}
