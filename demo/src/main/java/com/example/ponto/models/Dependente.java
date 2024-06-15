package com.example.ponto.models;

import com.example.ponto.models.enums.Escolaridade;

import java.time.LocalDate;

public class Dependente extends EntityId {
    private String nomeDependentes;
    private Escolaridade escolaridade;
    private LocalDate dataNascimento;

    public String getNomeDependentes() {
        return nomeDependentes;
    }

    public void setNomeDependentes(String nomeDependentes) {
        this.nomeDependentes = nomeDependentes;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Dependentes{" +
                "nomeDependentes='" + nomeDependentes + '\'' +
                ", escolaridade=" + escolaridade +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
