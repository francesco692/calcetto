package com.example.calcetto.controller;

import com.example.calcetto.model.ResponseDTO;
import com.example.calcetto.model.TbTipoUtente;
import com.example.calcetto.service.TbTipoUtenteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/tipoUtente")
public class TipoUtenteController extends BaseController{

    @Autowired
    TbTipoUtenteService service;

    @PostMapping("/insertTipoUtente")
    @ApiOperation(value = "aggiunta o modifica di una riga sulla tabella tipo utente", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> save(@RequestBody TbTipoUtente data) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            TbTipoUtente result = service.save(data);
            response = setResponse(response, result, "dati salvati correttamente");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
    @PostMapping("/delete")
    @ApiOperation(value = "eliminazione di un elemento dalla tabella tipo utente", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> deleteTipoUtente(@RequestBody Map<String,Long> body) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            TbTipoUtente result = service.deleteTipoUtente(body.get("tipoUtenteId"));
            response = setResponse(response, result, "dati eliminati con successo");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
}
