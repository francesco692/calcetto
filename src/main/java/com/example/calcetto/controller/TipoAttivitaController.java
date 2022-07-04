package com.example.calcetto.controller;

import com.example.calcetto.model.ResponseDTO;
import com.example.calcetto.model.TbTipoAttivita;
import com.example.calcetto.service.TbTipoAttivitaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/tipoAttivita")
public class TipoAttivitaController extends BaseController {

    @Autowired
    TbTipoAttivitaService service;
    @PostMapping("/insertTipoAttivita")
    @ApiOperation(value = "aggiunta o modifica di una riga sulla tabella tipo attivita", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> save(@RequestBody TbTipoAttivita data) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            TbTipoAttivita result = service.save(data);
            response = setResponse(response, result, "dati salvati correttamente");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
    @PostMapping("/delete")
    @ApiOperation(value = "eliminazione di un elemento dalla tabella tipo attivita", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> deleteTipoAttivita(@RequestBody Map<String,Long> body) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            TbTipoAttivita result = service.deleteTipoAttivita(body.get("tipoAttivitaId"));
            response = setResponse(response, result, "dati eliminati con successo");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
}
