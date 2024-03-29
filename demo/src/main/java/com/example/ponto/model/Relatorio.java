package com.example.ponto.model;

public class Relatorio {
    private HorarioTrabalho horarioTrabalho;
    private RegistroPonto registroPonto;
    private Funcionario funcionario;

    public HorarioTrabalho getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(HorarioTrabalho horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public RegistroPonto getRegistroPonto() {
        return registroPonto;
    }

    public void setRegistroPonto(RegistroPonto registroPonto) {
        this.registroPonto = registroPonto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "horarioTrabalho=" + horarioTrabalho +
                ", registroPonto=" + registroPonto +
                ", funcionario=" + funcionario +
                '}';
    }
}
