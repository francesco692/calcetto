package com.example.calcetto.controller;

import com.example.calcetto.model.ResponseDTO;
import com.example.calcetto.model.TbGestore;
import com.example.calcetto.service.TbGestoreService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/gestore")
public class GestoreController extends BaseController{
	
    @Autowired
    TbGestoreService service;

    @PostMapping("/insertGestore")
    @ApiOperation(value = "aggiunta o modifica di una riga sulla tabella gestore", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> save(@RequestBody TbGestore data) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
    	    TbGestore result = service.save(data);
            response = setResponse(response, result, "dati salvati correttamente");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
    @PostMapping("/delete")
    @ApiOperation(value = "eliminazione di un elemento dalla tabella gestore", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> deleteGestore(@RequestBody Map<String,Long> body) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            TbGestore result = service.deleteGestore(body.get("gestoreId"));
            response = setResponse(response, result, "dati eliminati con successo");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
}
