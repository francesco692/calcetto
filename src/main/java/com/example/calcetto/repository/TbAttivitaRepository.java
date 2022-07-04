package com.example.calcetto.repository;

import com.example.calcetto.model.TbAttivita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbAttivitaRepository extends TbAttivitaCustomRepository, JpaRepository<TbAttivita, Long> {
}
