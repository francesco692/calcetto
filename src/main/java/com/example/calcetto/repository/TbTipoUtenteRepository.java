package com.example.calcetto.repository;

import com.example.calcetto.model.TbGestore;
import com.example.calcetto.model.TbTipoUtente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbTipoUtenteRepository extends TbTipoUtenteCustomRepository, JpaRepository<TbTipoUtente, Long> {
}
