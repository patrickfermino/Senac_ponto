package com.example.ponto.dto;

import com.example.ponto.models.domain.RegistroPonto;
import com.example.ponto.models.enums.TipoRegistro;

import java.time.LocalDateTime;

public class RegistroPontoDTO {

    private LocalDateTime horaPonto;
    private TipoRegistro tipoRegistro;

    public RegistroPontoDTO() {
    }

    public RegistroPontoDTO(LocalDateTime horaPonto, TipoRegistro tipoRegistro) {
        this.horaPonto = horaPonto;
        this.tipoRegistro = tipoRegistro;
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
                entity.getHoraPonto(),
                entity.getTipoRegistro()
        );
    }

    public RegistroPonto toEntity() {
        RegistroPonto entity = new RegistroPonto();
        entity.setHoraPonto(this.horaPonto);
        entity.setTipoRegistro(this.tipoRegistro);
        return entity;
    }

    @Override
    public String toString() {
        return "RegistroPontoDTO{" +
                "horaPonto=" + horaPonto +
                ", tipoRegistro=" + tipoRegistro +
                '}';
    }
}
