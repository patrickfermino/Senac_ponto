package com.senac.Ponto.model;

import java.time.LocalDate;

public class Certificacao {
    private String nome;
    private LocalDate data;
    private String cargaHoraria;
    private LocalDate dataEmissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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
                ", data=" + data +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                ", dataEmissao=" + dataEmissao +
                '}';
    }
}
