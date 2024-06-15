package com.example.ponto.models.domain;

import com.example.ponto.models.EntityId;
import com.example.ponto.models.Funcionario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Relatorio extends EntityId {

    @OneToMany(mappedBy = "relatorios")
    @JsonIgnore
    private List<Funcionario> funcionarios;

    @Column(name = "horario_trabalho")
    private HorarioTrabalho horarioTrabalho;
    @Column(name = "registro_ponto")
    private RegistroPonto registroPonto;
    @JoinColumn(name = "funcionario_id")
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
