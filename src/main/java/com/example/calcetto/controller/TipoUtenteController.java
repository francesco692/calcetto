package com.example.calcetto.controller;

import com.example.calcetto.model.TbTipoUtente;
import com.example.calcetto.service.TbTipoUtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/tipoUtente")
public class TipoUtenteController {

    @Autowired
    TbTipoUtenteService service;

    @PostMapping("/insertTipoUtente")
    public TbTipoUtente save(@RequestBody TbTipoUtente data) throws Exception
    {
        TbTipoUtente result = service.save(data);
        return result;
    }
    @PostMapping("/delete")
    public TbTipoUtente deleteTipoUtente(@RequestBody Map<String,Long> body) throws Exception
    {
        TbTipoUtente result = service.deleteTipoUtente(body.get("tipoUtenteId"));
        return result;
    }
}
