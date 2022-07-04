package com.example.calcetto.service;

import com.example.calcetto.model.TbAttivita;
import com.example.calcetto.repository.TbAttivitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TbAttivitaService {
    @Autowired
    TbAttivitaRepository repo;

    public TbAttivita save(TbAttivita data) throws Exception {
        TbAttivita result;
        try {
            result = repo.save(data);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return result;
    }
    public TbAttivita deleteAttivita(Long attivitaId) throws Exception {
        try
        {
            repo.deleteById(attivitaId);
        }
        catch (Exception e)
        {
            throw new Exception("la riga che hai cercato di eliminare è collegata ad un altra tabella", e);
        }
        return null;
    }
    public List<TbAttivita> filterAttivita(TbAttivita data) throws Exception
    {
        List<TbAttivita> result = new ArrayList<TbAttivita>();
        try
        {
            result = repo.filterAttivita(data);
        } catch (Exception e)
        {
            throw new Exception(e.getMessage());
        }
        return result;
    }
}
