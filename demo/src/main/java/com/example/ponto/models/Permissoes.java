package com.example.ponto.models;

import com.example.ponto.models.enums.NivelPermissao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Permissoes extends EntityId {

    @Column
    private Funcionario funcionario;
    @Column
    private NivelPermissao nivelPermissao;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public NivelPermissao getNivelPermissao() {
        return nivelPermissao;
    }

    public void setNivelPermissao(NivelPermissao nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }

    @Override
    public String toString() {
        return "Permissoes{" +
                "funcionario=" + funcionario +
                ", nivelPermissao=" + nivelPermissao +
                '}';
    }
}