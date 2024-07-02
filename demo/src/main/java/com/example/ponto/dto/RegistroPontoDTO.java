package com.example.ponto.dto;

import com.example.ponto.models.domain.RegistroPonto;
import com.example.ponto.models.enums.TipoRegistro;

import java.time.LocalDateTime;

public class RegistroPontoDTO {

    private Long id;
    private LocalDateTime horaPonto;
    private TipoRegistro tipoRegistro;

    public RegistroPontoDTO(Long id, LocalDateTime horaPonto, TipoRegistro tipoRegistro) {
        this.id = id;
        this.horaPonto = horaPonto;
        this.tipoRegistro = tipoRegistro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getHoraPonto() {
        return horaPonto;
    }

    public void setHoraPonto(LocalDateTime horaPonto) {
        this.horaPonto = horaPonto;
    }

    public TipoRegistro getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(TipoRegistro tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public static RegistroPontoDTO fromEntity(RegistroPonto entity) {
        return new RegistroPontoDTO(
                entity.getId(),
                entity.getHoraPonto(),
                entity.getTipoRegistro()
        );
    }

    public RegistroPonto toEntity() {
        RegistroPonto entity = new RegistroPonto();
        entity.setId(this.id);
        entity.setHoraPonto(this.horaPonto);
        entity.setTipoRegistro(this.tipoRegistro);
        return entity;
    }

    @Override
    public String toString() {
        return "RegistroPontoDTO{" +
                "id=" + id +
                ", horaPonto=" + horaPonto +
                ", tipoRegistro=" + tipoRegistro +
                '}';
    }
}
