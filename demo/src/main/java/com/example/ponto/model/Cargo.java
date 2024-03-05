package com.example.ponto.model;

public class Cargo {
    private String descricao;
    private String nivel;
    private Boolean condicionado;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Boolean getCondicionado() {
        return condicionado;
    }

    public void setCondicionado(Boolean condicionado) {
        this.condicionado = condicionado;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "descricao='" + descricao + '\'' +
                ", nivel='" + nivel + '\'' +
                ", condicionado=" + condicionado +
                '}';
    }
}
