package com.example.calcetto.controller;

import com.example.calcetto.model.TbGestore;
import com.example.calcetto.model.TbUtente;
import com.example.calcetto.service.TbUtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/utente")
public class UtenteController
{

    @Autowired
    TbUtenteService service;

    @PostMapping("/insertUtente")
    public TbUtente save(@RequestBody TbUtente data) throws Exception
    {
        TbUtente result = service.save(data);
        return result;
    }
    @PostMapping("/delete")
    public TbUtente deleteUtente(@RequestBody Map<String,Long> body) throws Exception
    {
        TbUtente result = service.deleteUtente(body.get("utenteId"));
        return result;
    }
    @PostMapping("/disponibilita")
    public List<TbGestore> disponibilita() throws Exception
    {
        List<TbGestore> result = service.visualizzaDisponibili();
        return result;
    }
    @PostMapping("/ricercaPerCitta")
    public List<TbGestore> localita(@RequestBody Map<String,String> body) throws Exception
    {
        List<TbGestore> result = service.localita(body.get("citta"));
        return result;
    }
    @PostMapping("/cercaPerPrezzo")
    public List<TbGestore> findByPrezzo(@RequestBody Map<String,String> body) throws Exception
    {
        List<TbGestore> result = service.findByPrezzo(body.get("prezzo"));
        return result;
    }
}
