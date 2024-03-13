package com.example.ponto.model;

import com.example.ponto.model.enums.TipoRegistro;

import java.time.LocalDateTime;

public class RegistroPonto {

    private Integer idRegistro;
    private Funcionario funcionario;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private TipoRegistro tipoRegistro;

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
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
                "idRegistro=" + idRegistro +
                ", funcionario=" + funcionario +
                ", horaEntrada=" + horaEntrada +
                ", horaSaida=" + horaSaida +
                ", tipoRegistro=" + tipoRegistro +
                '}';
    }
}
