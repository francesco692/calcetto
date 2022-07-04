package com.example.calcetto.controller;

import com.example.calcetto.model.ResponseDTO;
import com.example.calcetto.model.TbSlot;
import com.example.calcetto.service.TbSlotService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/slot")
public class SlotController extends BaseController
{
    @Autowired
    TbSlotService service;
    @PostMapping("/insertSlot")
    @ApiOperation(value = "aggiunta o modifica di una riga sulla tabella slot", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> save(@RequestBody TbSlot data) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            TbSlot result = service.save(data);
            response = setResponse(response, result, "dati salvati correttamente");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
    @PostMapping("/delete")
    @ApiOperation(value = "eliminazione di un elemento dalla tabella slot", notes = "", response = ResponseDTO.class)
    public ResponseEntity<ResponseDTO> deleteSlot(@RequestBody Map<String,Long> body) throws Exception
    {
        ResponseDTO response = new ResponseDTO();
        try
        {
            TbSlot result = service.deleteSlot(body.get("slotId"));
            response = setResponse(response, result, "dati eliminati con successo");
        }
        catch (Exception e)
        {
            response = setResponseError(response, e);
        }
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
}
