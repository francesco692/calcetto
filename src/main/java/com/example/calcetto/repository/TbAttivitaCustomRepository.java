package com.example.calcetto.repository;

import com.example.calcetto.model.TbAttivita;

import java.util.List;

public interface TbAttivitaCustomRepository {
    List<TbAttivita> filterAttivita(TbAttivita data);
    List<TbAttivita> findByPrezzo(String prezzo);
}
