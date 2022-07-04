package com.example.calcetto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_attivita")
public class TbAttivita implements Serializable {
    @Id
    @Column(name = "attivitaId")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long attivitaId;
    @Column(name = "nomeAttivita")
    private String nomeAttivita;
    @ManyToOne
    @JoinColumn(name = "tipoAttivitaId")
    private TbTipoAttivita fromTipoAttivita;
    @Column(name = "prezzo")
    private String prezzo;

    public Long getAttivitaId() {
        return attivitaId;
    }
    public String getNomeAttivita() {
        return nomeAttivita;
    }
    public TbTipoAttivita getFromTipoAttivita() {
        return fromTipoAttivita;
    }
    public String getPrezzo() {
        return prezzo;
    }

    public void setAttivitaId(Long attivitaId) {
        this.attivitaId = attivitaId;
    }
    public void setNomeAttivita(String nomeAttivita) {
        this.nomeAttivita = nomeAttivita;
    }
    public void setFromTipoAttivita(TbTipoAttivita fromTipoAttivita) {
        this.fromTipoAttivita = fromTipoAttivita;
    }
    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }
}
