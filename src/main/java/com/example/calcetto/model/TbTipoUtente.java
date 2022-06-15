package com.example.calcetto.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_tipo_utente")
public class TbTipoUtente {
    @Id
    @Column(name = "tipoUtenteId")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long tipoUtenteId;
    @Column(name = "ruolo")
    private String ruolo;


    public Long getTipoUtenteId() {
        return tipoUtenteId;
    }
    public String getRuolo() {
        return ruolo;
    }

    public void setTipoUtenteId(Long tipoUtenteId) {
        this.tipoUtenteId = tipoUtenteId;
    }
    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
}
