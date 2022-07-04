package com.example.calcetto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_tipo_attivita")
public class TbTipoAttivita implements Serializable {
    @Id
    @Column(name = "tipoAttivitaId")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long tipoAttivitaId;
    @Column(name = "nomeTipoAttivita")
    private String nomeTipoAttivita;

    public Long getTipoAttivitaId() {
        return tipoAttivitaId;
    }
    public String getNomeTipoAttivita() {
        return nomeTipoAttivita;
    }

    public void setTipoAttivitaId(Long tipoAttivitaId) {
        this.tipoAttivitaId = tipoAttivitaId;
    }
    public void setNomeTipoAttivita(String nomeTipoAttivita) {
        this.nomeTipoAttivita = nomeTipoAttivita;
    }
}
