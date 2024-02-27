package com.example.demo;

import java.time.LocalDate;

public class ExpAnterior {
    private String descricao;
    private String cargo;
    private LocalDate periodoInicial;
    private LocalDate PeriodoFinal;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getPeriodoInicial() {
        return periodoInicial;
    }

    public void setPeriodoInicial(LocalDate periodoInicial) {
        this.periodoInicial = periodoInicial;
    }

    public LocalDate getPeriodoFinal() {
        return PeriodoFinal;
    }

    public void setPeriodoFinal(LocalDate periodoFinal) {
        PeriodoFinal = periodoFinal;
    }

    @Override
    public String toString() {
        return "ExpAnterior{" +
                "descricao='" + descricao + '\'' +
                ", cargo='" + cargo + '\'' +
                ", periodoInicial=" + periodoInicial +
                ", PeriodoFinal=" + PeriodoFinal +
                '}';
    }
}
