package com.example.ponto.model;

import jakarta.persistence.*;

import java.time.Duration;
import java.time.LocalTime;
//import com.example.ponto.model.Funcionario;

public class HorarioTrabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Funcionario funcionario;
    private LocalTime horaPadraoEntrada;
    private LocalTime horaPadraoSaida;
    private LocalTime horaPadraoIntervalo;
    private String diasTrabalhados;


    public Funcionario getFuncionario() {
        return funcionario;
    }


    public LocalTime gethoraEntradaPadrao() {
        return LocalTime.of(8, 0);
    }


    public LocalTime gethoraSaidaPadrao() {
        return LocalTime.of(18, 0);
    }


    public LocalTime gethoraEntradaIntervalo() {
        return LocalTime.of(12, 0);
    }


    public LocalTime gethoraSaidaIntervalo() {
        return LocalTime.of(13, 30);
    }

    public LocalTime gethoraPadraoIntervalo() {
        return LocalTime.of(1, 30);
    }

    public LocalTime getHoraEntradaPadrao() {
        return horaPadraoEntrada;
    }

    public LocalTime getHoraSaidaPadrao() {
        return horaPadraoSaida;
    }


    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
