package com.example.ponto.model;

import java.time.LocalTime;

public class HorarioTrabalho {
    private Funcionario funcionario;
    private LocalTime horaPadraoEntrada;
    private LocalTime horaPadraoSaida;
    private LocalTime horaPadraoIntervalo;
    private String diasTrabalhados;

    //Regra de negocio calculo de horas com limite de horas por dia
    public long calcularHorasTrabalhadas() {
        // Verifica se os horários de entrada e saída foram definidos
        if (horaPadraoEntrada == null || horaPadraoSaida == null) {
            return 0; // Se algum dos horários não estiver definido, retorna 0 horas trabalhadas
        }
        // Calcula a duração entre a hora de entrada e a hora de saída
        Duration duracaoTrabalho = Duration.between(horaPadraoEntrada, horaPadraoSaida);

        // Subtrai a duração do intervalo de descanso (1 hora e meia) da duração total de trabalho
        duracaoTrabalho = duracaoTrabalho.minus(Duration.ofMinutes(90));

        // Verifica se a duração total de trabalho é menor ou igual ao limite de horas por dia (8 horas)
        if (duracaoTrabalho.toHours() <= 8) {
            // Se for, retorna a duração total de trabalho em horas
            return duracaoTrabalho.toHours();
        } else {
            // Caso contrário, retorna o valor excedente
            return duracaoTrabalho.toHours() - 8;
        }
    }

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
