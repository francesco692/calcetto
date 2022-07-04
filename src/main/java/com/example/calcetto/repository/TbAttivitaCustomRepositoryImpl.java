package com.example.calcetto.repository;

import com.example.calcetto.model.TbAttivita;
import com.example.calcetto.model.TbGestore;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class TbAttivitaCustomRepositoryImpl implements TbAttivitaCustomRepository {
    @Autowired
    EntityManager em;
    @Override
    public List<TbAttivita> findByPrezzo(String prezzo)
    {
        List<TbAttivita> result = new ArrayList<TbAttivita>();
        String query = "select * from tb_attivita ta where prezzo = '"+prezzo+"'";
        Query a = em.createNativeQuery(query, TbGestore.class);
        result = a.getResultList();
        return result;
    }
    @Override
    public List<TbAttivita> filterAttivita(TbAttivita data) {
        List<TbAttivita> result = new ArrayList<TbAttivita>();
        String f1 = "";
        String f2 = "";
        String f3 = "";

        String al = "select * from tb_attivita ca where 1=1";
        if (data.getNomeAttivita() != null) {
            f1 = "and upper(at.nomeAttivita) like upper('%" + data.getNomeAttivita() + "%')";
        }
        if (data.getFromTipoAttivita() != null) {
            f2 = "and upper(at.fromTipoAttivita) like upper('%" + data.getFromTipoAttivita() + "%')";
        }
        if (data.getPrezzo() != null) {
            f3 = "and upper(at.prezzo) like upper('%" + data.getPrezzo() + "%')";
        }
        String finalQuery = al + " " + f1 + " " + f2 + " " + f3;
        Query b = em.createNativeQuery(finalQuery, TbAttivita.class);

        result = b.getResultList();

        return result;
    }
}
