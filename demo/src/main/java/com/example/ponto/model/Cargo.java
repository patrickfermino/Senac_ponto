package com.example.ponto.model;

import jakarta.persistence.*;
@Entity
@Table(name="cargo")
public class Cargo extends EntityId {

    @Column(name="descricao", nullable = false)
    private String descricao;
    @Column(name="nivel", nullable = false)
    private String nivel;
    @Column(name="comissionado", nullable = false)
    private Boolean comissionado;

    public Cargo() {

    }

    public Cargo(String descricao, String nivel, Boolean comissionado){
        this.descricao = descricao;
        this.nivel = nivel;
        this.comissionado = comissionado;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao (String descricao){
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel (String nivel){
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
