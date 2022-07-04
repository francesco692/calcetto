package com.example.calcetto.model;

import javax.persistence.*;
import java.util.Date;

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
    @JoinColumn(name = "attivitaId")
    private TbAttivita fromAttivita;


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
    public TbAttivita getFromAttivita() {
        return fromAttivita;
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
    public void setFromAttivita(TbAttivita fromAttivita) {
        this.fromAttivita = fromAttivita;
    }
}
