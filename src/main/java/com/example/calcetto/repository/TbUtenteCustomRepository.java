package com.example.calcetto.repository;

import com.example.calcetto.model.TbUtente;

public interface TbUtenteCustomRepository {
    String getPasswordByUser(String nome);
    TbUtente logIn(String nome, String password);
}
