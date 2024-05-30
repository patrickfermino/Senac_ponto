package com.example.ponto.model;
import java.time.LocalTime;
import com.example.ponto.model.enums.TipoRegistro;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class RegistroPonto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne

    private Integer idRegistro;
    private Funcionario funcionario;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private String tipoRegistro;



    public class RegistroPonto {
        private LocalTime horaRegistro;

        // Outros atributos e métodos da classe

        // Método para registrar o ponto com o horário atual
        public void registrarPonto() {
            this.horaRegistro = LocalTime.now();
        }

        // método para verificar se o ponto foi registrado dentro do horário válido
        public boolean pontoDentroHorarioValido(HorarioTrabalho horarioTrabalho) {
            LocalTime horaEntrada = horarioTrabalho.getHoraEntradaPadrao();
            LocalTime horaSaida = horarioTrabalho.getHoraSaidaPadrao();
            LocalTime horaEntradaIntervalo = horarioTrabalho.getHoraPadraoEntrada();
            LocalTime horaSaidaIntervalo = horarioTrabalho.getHoraPadraoSaida();

            // verifica se o ponto está entre a hora de entrada e saída padrão ou entre o intervalo
            return (horaRegistro.isAfter(horaEntrada) && horaRegistro.isBefore(horaSaida)) ||
                    (horaRegistro.isAfter(horaEntradaIntervalo) && horaRegistro.isBefore(horaSaidaIntervalo));
        }
    }

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

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
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
