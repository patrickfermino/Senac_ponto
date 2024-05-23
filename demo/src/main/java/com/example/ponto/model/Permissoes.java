package com.example.ponto.model;

import com.example.ponto.model.enums.NivelPermissao;

public class Permissoes {
private Funcionario funcionario;
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
// falta a validação das horas trabalhadas
//commit teste