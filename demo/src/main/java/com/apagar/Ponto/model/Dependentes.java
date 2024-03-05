package com.senac.Ponto.model;

import java.time.LocalDate;

public class Dependentes {
    private String nome;
    private Escolaridade Escolaridade;
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public com.senac.Ponto.model.Escolaridade getEscolaridade() {
        return Escolaridade;
    }

    public void setEscolaridade(com.senac.Ponto.model.Escolaridade escolaridade) {
        Escolaridade = escolaridade;
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
                "nome='" + nome + '\'' +
                ", Escolaridade=" + Escolaridade +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
