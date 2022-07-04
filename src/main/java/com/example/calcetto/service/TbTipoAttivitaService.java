package com.example.calcetto.service;

import com.example.calcetto.model.TbGestore;
import com.example.calcetto.model.TbTipoAttivita;
import com.example.calcetto.repository.TbTipoAttivitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbTipoAttivitaService
{
    @Autowired
    TbTipoAttivitaRepository repo;
    public TbTipoAttivita save(TbTipoAttivita data) throws Exception {
        TbTipoAttivita result;
        try {
            result = repo.save(data);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return result;
    }
    public TbTipoAttivita deleteTipoAttivita(Long tipoAttivitaId) throws Exception {
        try
        {
            repo.deleteById(tipoAttivitaId);
        }
        catch (Exception e)
        {
            throw new Exception("la riga che hai cercato di eliminare è collegata ad un altra tabella", e);
        }
        return null;
    }
}
