package com.example.ponto.models.domain;

import com.example.ponto.models.EntityId;
import com.example.ponto.models.enums.TipoRegistro;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RegistroPonto extends EntityId {

    @Column(name = "hora_ponto", nullable = false)
    private LocalDateTime horaPonto;
    @Column(name = "tipo_registro", nullable = false)
    private TipoRegistro tipoRegistro;

    public LocalDateTime getHoraPonto() {
        return horaPonto;
    }

    public void setHoraPonto(LocalDateTime horaBatida) {
        this.horaPonto = horaBatida;
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
                "horaPonto=" + horaPonto +
                ", tipoRegistro=" + tipoRegistro +
                '}';
    }
}
