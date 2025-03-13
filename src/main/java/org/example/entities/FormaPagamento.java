package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FormaPagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TIPO", nullable = false)
    private String tipo;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    public FormaPagamento() {
    }

    public FormaPagamento(Long id, String tipo, String descricao) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
