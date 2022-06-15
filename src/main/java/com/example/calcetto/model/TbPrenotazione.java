package com.example.calcetto.model;

import javax.persistence.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "calcetto",name = "tb_prenotazione")
public class TbPrenotazione
{

    @Id
    @Column(name = "prenotazioneId")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long prenotazioneId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date oraInizio;
    @Temporal(TemporalType.TIMESTAMP)
    private Date oraFine;
    @Column(name = "numeroGiocatori")
    private int numeroGiocatori;
    @ManyToOne
    @JoinColumn(name = "utenteId")
    private TbUtente fromUtente;
    @ManyToOne
    @JoinColumn(name = "gestoreId")
    private TbGestore fromGestore;


    public Long getPrenotazioneId() {
        return prenotazioneId;
    }
    public Date getOraInizio() {
        return oraInizio;
    }
    public Date getOraFine() {
        return oraFine;
    }
    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }
    public TbUtente getFromUtente() {
        return fromUtente;
    }
    public TbGestore getFromGestore() {
        return fromGestore;
    }

    public void setPrenotazioneId(Long prenotazioneId) {
        this.prenotazioneId = prenotazioneId;
    }
    public void setOraInizio(Date oraInizio) {
        this.oraInizio = oraInizio;
    }
    public void setOraFine(Date oraFine) {
        this.oraFine = oraFine;
    }
    public void setNumeroGiocatori(int numeroGiocatori) {
        this.numeroGiocatori = numeroGiocatori;
    }
    public void setFromUtente(TbUtente fromUtente) {
        this.fromUtente = fromUtente;
    }
    public void setFromGestore(TbGestore fromGestore) {
        this.fromGestore = fromGestore;
    }
}
