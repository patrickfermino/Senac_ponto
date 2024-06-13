package com.example.ponto.model;

import com.example.ponto.model.enums.TipoRegistro;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RegistroPonto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Hora_Batida", nullable = false)
    private LocalDateTime horaBatida;

    @Column(name = "tipoRegistro", nullable = false)
    private TipoRegistro tipoRegistro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getHoraBatida() {
        return horaBatida;
    }

    public void setHoraBatida(LocalDateTime horaBatida) {
        this.horaBatida = horaBatida;
    }

    public TipoRegistro getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(TipoRegistro tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Override
    public String toString() {
        return "RegistroPonto{" +
                "id=" + id +
                ", horaBatida=" + horaBatida +
                ", tipoRegistro=" + tipoRegistro +
                '}';
    }
}
