package com.example.calcetto.repository;

import com.example.calcetto.model.TbGestore;
import com.example.calcetto.model.TbUtente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbUtenteRepository extends TbUtenteCustomRepository, JpaRepository<TbUtente, Long> {
}
