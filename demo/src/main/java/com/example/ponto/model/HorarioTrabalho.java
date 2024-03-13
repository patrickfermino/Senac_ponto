package com.example.ponto.model;

import java.time.LocalTime;

public class HorarioTrabalho {
    private Funcionario funcionario;
    private LocalTime horaPadraoEntrada;
    private LocalTime horaPadraoSaida;
    private LocalTime horaPadraoIntervalo;
    private String diasTrabalhados;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalTime getHoraPadraoEntrada() {
        return horaPadraoEntrada;
    }

    public void setHoraPadraoEntrada(LocalTime horaPadraoEntrada) {
        this.horaPadraoEntrada = horaPadraoEntrada;
    }

    public LocalTime getHoraPadraoSaida() {
        return horaPadraoSaida;
    }

    public void setHoraPadraoSaida(LocalTime horaPadraoSaida) {
        this.horaPadraoSaida = horaPadraoSaida;
    }

    public LocalTime getHoraPadraoIntervalo() {
        return horaPadraoIntervalo;
    }

    public void setHoraPadraoIntervalo(LocalTime horaPadraoIntervalo) {
        this.horaPadraoIntervalo = horaPadraoIntervalo;
    }

    public String getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(String diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    @Override
    public String toString() {
        return "HorarioTrabalho{" +
                "funcionario=" + funcionario +
                ", horaPadraoEntrada=" + horaPadraoEntrada +
                ", horaPadraoSaida=" + horaPadraoSaida +
                ", horaPadraoIntervalo=" + horaPadraoIntervalo +
                ", diasTrabalhados='" + diasTrabalhados + '\'' +
                '}';
    }
}
