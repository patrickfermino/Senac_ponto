package com.example.ponto.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Calendario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Data", nullable = false)
    private LocalDate data;

    @Column(name = "Feriado", nullable = false)
    private boolean feriado;

    @Column(name = "Final_De_Semana", nullable = false)
    private boolean finalDeSemana;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isFeriado() {
        return feriado;
    }

    public void setFeriado(boolean feriado) {
        this.feriado = feriado;
    }

    public boolean isFinalDeSemana() {
        return finalDeSemana;
    }

    public void setFinalDeSemana(boolean finalDeSemana) {
        this.finalDeSemana = finalDeSemana;
    }
}
