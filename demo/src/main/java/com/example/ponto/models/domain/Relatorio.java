package com.example.ponto.models.domain;

import com.example.ponto.models.EntityId;
import com.example.ponto.models.Funcionario;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Relatorio extends EntityId {

    @ManyToMany
    @JoinTable(name = "relatorio_funcionarios",
            joinColumns = @JoinColumn(name = "relatorio_id"),
            inverseJoinColumns = @JoinColumn(name = "funcionario_id"))
    private List<Funcionario> funcionarios;

    @ManyToOne
    @JoinColumn(name = "horario_trabalho_id")
    private HorarioTrabalho horarioTrabalho;

    @OneToMany(mappedBy = "relatorio")
    private List<RegistroPonto> registrosPonto;

    public Relatorio() {
    }

    public Relatorio(List<Funcionario> funcionarios, HorarioTrabalho horarioTrabalho, List<RegistroPonto> registrosPonto) {
        this.funcionarios = funcionarios;
        this.horarioTrabalho = horarioTrabalho;
        this.registrosPonto = registrosPonto;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public HorarioTrabalho getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(HorarioTrabalho horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public List<RegistroPonto> getRegistrosPonto() {
        return registrosPonto;
    }

    public void setRegistrosPonto(List<RegistroPonto> registrosPonto) {
        this.registrosPonto = registrosPonto;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "funcionarios=" + funcionarios +
                ", horarioTrabalho=" + horarioTrabalho +
                ", registrosPonto=" + registrosPonto +
                '}';
    }
}
