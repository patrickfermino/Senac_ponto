package com.example.ponto.models;

import jakarta.persistence.Column;
import jakarta.persistence.*;

@Entity
public class Cargo extends EntityId {

    @Column
    private String descricao;
    @Column
    private String nivel;
    @Column
    private Boolean comissionado;

    public Cargo(String descricao, String nivel, Boolean comissionado) {
        this.descricao = descricao;
        this.nivel = nivel;
        this.comissionado = comissionado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Boolean getComissionado() {
        return comissionado;
    }

    public void setComissionado(Boolean comissionado) {
        this.comissionado = comissionado;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "descricao='" + descricao + '\'' +
                ", nivel='" + nivel + '\'' +
                ", comissionado=" + comissionado +
                '}';
    }
}
