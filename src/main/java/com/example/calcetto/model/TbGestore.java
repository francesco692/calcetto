package com.example.calcetto.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_gestore")
public class TbGestore implements Serializable
{
    @Id
    @Column(name = "gestoreId")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long gestoreId;
    @Column(name = "indirizzo")
    private String indirizzo;
    @Column(name = "citta")
    private String citta;
    @Temporal(TemporalType.TIMESTAMP)
    private Date oraApertura;
    @Temporal(TemporalType.TIMESTAMP)
    private Date oraChiusura;
    @ManyToOne
    @JoinColumn(name = "attivitaId")
    private TbAttivita fromAttivita;


    public Long getGestoreId() {
        return gestoreId;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public String getCitta() {
        return citta;
    }
    public Date getOraApertura() {
        return oraApertura;
    }
    public Date getOraChiusura() {
        return oraChiusura;
    }
    public TbAttivita getFromAttivita() {
        return fromAttivita;
    }

    public void setGestoreId(Long gestoreId) {
        this.gestoreId = gestoreId;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public void setCitta(String citta) {
        this.citta = citta;
    }
    public void setOraApertura(Date oraApertura) {
        this.oraApertura = oraApertura;
    }
    public void setOraChiusura(Date oraChiusura) {
        this.oraChiusura = oraChiusura;
    }
    public void setFromAttivita(TbAttivita fromAttivita) {
        this.fromAttivita = fromAttivita;
    }
}
