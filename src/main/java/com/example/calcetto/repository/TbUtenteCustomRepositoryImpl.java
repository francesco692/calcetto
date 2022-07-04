package com.example.calcetto.repository;

import com.example.calcetto.model.TbUtente;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class TbUtenteCustomRepositoryImpl implements TbUtenteCustomRepository {
    @Autowired
    EntityManager em;
    @Override
    public String getPasswordByUser(String nome) {

        String result = "";

        Query q = em.createNativeQuery("select tu.password from tb_utente tu where tu.nome = '" + nome + "'");

        result = q.getSingleResult().toString();

        return result;
    }

    @Override
    public TbUtente logIn(String nome, String password) {

        List<TbUtente> result = null;

        Query q = em.createNativeQuery(
                "select * from tb_utente tu where 1=1 "
                        + "and tu.nome = '" + nome + "' && tu.password = '" + password + "'",
                TbUtente.class);
        result = q.getResultList();

        if (result.isEmpty()) {
            return null;
        } else {
            return result.get(0);
        }
    }

}
