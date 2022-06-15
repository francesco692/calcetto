package com.example.calcetto.repository;

import com.example.calcetto.model.TbGestore;

import java.util.List;

public interface TbGestoreCustomRepository {

    List<TbGestore> disponibilita();
    List<TbGestore> localita(String citta);
    List<TbGestore> findByPrezzo(String prezzo);
}
