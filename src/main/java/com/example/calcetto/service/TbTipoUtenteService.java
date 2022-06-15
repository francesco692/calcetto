package com.example.calcetto.service;
import com.example.calcetto.model.TbTipoUtente;
import com.example.calcetto.repository.TbTipoUtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class TbTipoUtenteService
{
    @Autowired
    TbTipoUtenteRepository repo;
    public TbTipoUtente save(TbTipoUtente data) throws Exception {
        TbTipoUtente result;
        try {
            result = repo.save(data);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return result;
    }
    public TbTipoUtente deleteTipoUtente(Long tipoUtenteId) throws Exception
    {
        try
        {
            repo.deleteById(tipoUtenteId);
        }
        catch (Exception e)
        {
            throw new Exception("la riga che hai cercato di eliminare è collegata ad un altra tabella", e);
        }
        return null;
    }
}
