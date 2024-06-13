package com.example.ponto.model;

import jakarta.persistence.*;

import java.time.Duration;
import java.time.LocalTime;
import com.example.ponto.model.Funcionario;
@Entity
public class HorarioTrabalho  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "horaPadraoEntrada", nullable = false)
    private LocalTime horaPadraoEntrada;
    @Column(name = "horaPadraoSaida", nullable = false)
    private LocalTime horaPadraoSaida;
    @Column(name = "horaPadraoIntervalo", nullable = false)
    private LocalTime horaPadraoIntervalo;
    @Column(name = "diasTrabalhados", nullable = false)
    private String diasTrabalhados;

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
                ", horaPadraoEntrada=" + horaPadraoEntrada +
                ", horaPadraoSaida=" + horaPadraoSaida +
                ", horaPadraoIntervalo=" + horaPadraoIntervalo +
                ", diasTrabalhados='" + diasTrabalhados + '\'' +
                '}';
    }
}
