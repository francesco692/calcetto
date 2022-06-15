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
    @Column(name = "prezzo")
    private String prezzo;
    @Column(name = "indirizzo")
    private String indirizzo;
    @Column(name = "citta")
    private String citta;
    @Temporal(TemporalType.TIMESTAMP)
    private Date oraApertura;
    @Temporal(TemporalType.TIMESTAMP)
    private Date oraChiusura;
    @Column(name = "isDisponibile")
    private boolean isDisponibile;


    public Long getGestoreId() {
        return gestoreId;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public String getPrezzo() {
        return prezzo;
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
    public boolean isDisponibile() {
        return isDisponibile;
    }


    public void setGestoreId(Long gestoreId) {
        this.gestoreId = gestoreId;
    }
    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
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
    public void setDisponibile(boolean disponibile) {
        isDisponibile = disponibile;
    }
}
