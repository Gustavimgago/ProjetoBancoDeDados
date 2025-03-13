package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TELEFONE", nullable = false)
    private String telefone;

    @Column(name = "CELULAR", nullable = false)
    private String celular;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    public Contato() {
    }

    public Contato(Long id, String telefone, String celular, String email) {
        this.id = id;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
