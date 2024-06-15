package com.example.ponto.models;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Certificacao extends EntityId {

    private String nome;
    private String cargaHoraria;
    private LocalDate dataEmissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Override
    public String toString() {
        return "Certificacao{" +
                "nome='" + nome + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                ", dataEmissao=" + dataEmissao +
                '}';
    }
}
