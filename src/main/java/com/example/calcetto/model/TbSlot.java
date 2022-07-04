package com.example.calcetto.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_slot")
public class TbSlot {
    @Id
    @Column(name = "slotId")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long slotId;
    @ManyToOne
    @JoinColumn(name = "gestoreId")
    private TbGestore fromGestore;
    @ManyToOne
    @JoinColumn(name = "attivitaId")
    private TbAttivita fromAttivita;
    @Column(name = "nomeSlot")
    private String nomeSlot;
    @Column(name = "unita")
    private String unita;
    @Column(name = "valoreTemporale")
    private float valoreTemporale;



    public Long getSlotId() {
        return slotId;
    }
    public TbGestore getFromGestore() {
        return fromGestore;
    }
    public TbAttivita getFromAttivita() {
        return fromAttivita;
    }
    public String getNomeSlot() {
        return nomeSlot;
    }
    public String getUnita() {
        return unita;
    }
    public float getValoreTemporale() {
        return valoreTemporale;
    }


    public void setSlotId(Long slotId) {
        this.slotId = slotId;
    }
    public void setFromGestore(TbGestore fromGestore) {
        this.fromGestore = fromGestore;
    }
    public void setFromAttivita(TbAttivita fromAttivita) {
        this.fromAttivita = fromAttivita;
    }
    public void setNomeSlot(String nomeSlot) {
        this.nomeSlot = nomeSlot;
    }
    public void setUnita(String unita) {
        this.unita = unita;
    }
    public void setValoreTemporale(float valoreTemporale) {
        this.valoreTemporale = valoreTemporale;
    }
}
