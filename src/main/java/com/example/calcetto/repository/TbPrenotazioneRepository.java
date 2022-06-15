package com.example.calcetto.repository;

import com.example.calcetto.model.TbGestore;
import com.example.calcetto.model.TbPrenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbPrenotazioneRepository extends TbPrenotazioneCustomRepository, JpaRepository<TbPrenotazione, Long>
{
}
