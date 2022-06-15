package com.example.calcetto.controller;

import com.example.calcetto.model.TbPrenotazione;
import com.example.calcetto.service.TbPrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/prenotazione")
public class PrenotazioneController {
    @Autowired
    TbPrenotazioneService service;

    @PostMapping("/insertPrenotazione")
    public TbPrenotazione save(@RequestBody TbPrenotazione data) throws Exception
    {
        TbPrenotazione result = service.save(data);
        return result;
    }
    @PostMapping("/delete")
    public TbPrenotazione deletePrenotazione(@RequestBody Map<String,Long> body) throws Exception
    {
        TbPrenotazione result = service.deletePrenotazione(body.get("prenotazioneId"));
        return result;
    }
}
