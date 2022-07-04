package com.example.calcetto.controller;

import com.example.calcetto.model.ResponseDTO;
import com.example.calcetto.model.TbAttivita;
import com.example.calcetto.service.TbAttivitaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/attivita")
public class AttivitaController extends BaseController {

    @Autowired
    TbAttivitaService service;
    @PostMapping("/insertAttivita")
    @ApiOperation(value = "aggiunta o modifica di una riga sulla tabella attivita", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> save(@RequestBody TbAttivita data) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            TbAttivita result = service.save(data);
            response = setResponse(response, result, "dati salvati correttamente");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
    @PostMapping("/delete")
    @ApiOperation(value = "eliminazione di un elemento nella tabella attivita", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> deleteAttivita(@RequestBody Map<String,Long> body) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            TbAttivita result = service.deleteAttivita(body.get("attivitaId"));
            response = setResponse(response, result, "dati eliminati con successo");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
    @PostMapping("/filterAttivita")
    @ApiOperation(value = "operazione di filter sulla tabella attivita", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> filterAttivita(@RequestBody TbAttivita data) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            List<TbAttivita> result = service.filterAttivita(data);
            response = setResponse(response, result, "");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
}
