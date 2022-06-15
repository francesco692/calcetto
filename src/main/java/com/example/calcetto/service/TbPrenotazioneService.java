package com.example.calcetto.service;

import com.example.calcetto.model.TbGestore;
import com.example.calcetto.model.TbPrenotazione;
import com.example.calcetto.model.TbUtente;
import com.example.calcetto.repository.TbPrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;

@Service
public class TbPrenotazioneService
{
    @Autowired
    TbPrenotazioneRepository repo;
    public TbPrenotazione save(TbPrenotazione data) throws Exception {
        TbPrenotazione result;
        try
        {
           result = repo.save(data);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return result;
    }
    public TbPrenotazione deletePrenotazione(Long prenotazioneId) throws Exception {
        try
        {
            repo.deleteById(prenotazioneId);
        }
        catch (Exception e)
        {
            throw new Exception("la riga che hai cercato di eliminare è collegata ad un altra tabella", e);
        }
        return null;
    }
}
