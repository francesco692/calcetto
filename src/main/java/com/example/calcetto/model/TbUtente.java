package com.example.calcetto.model;

import javax.persistence.*;
import javax.transaction.Transaction;
import java.util.Set;

@Entity
@Table(name = "tb_utente")
public class TbUtente {
    @Id
    @Column(name = "utenteId")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long utenteId;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "email")
    private String email;
    @OneToOne
    @JoinColumn(name = "tipoUtenteId")
    private TbTipoUtente fromTipoUtente;
    @OneToOne
    @JoinColumn(name = "gestoreId")
    private TbGestore fromGestore;
    @Column(name = "password")
    private String password;


    public Long getUtenteId() {
        return utenteId;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getEmail() {
        return email;
    }
    public TbTipoUtente getFromTipoUtente() {
        return fromTipoUtente;
    }
    public TbGestore getFromGestore() {
        return fromGestore;
    }
    public String getPassword() {
        return password;
    }
    public void setUtenteId(Long utenteId) {
        this.utenteId = utenteId;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFromTipoUtente(TbTipoUtente fromTipoUtente) {
        this.fromTipoUtente = fromTipoUtente;
    }
    public void setFromGestore(TbGestore fromGestore) {
        this.fromGestore = fromGestore;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
