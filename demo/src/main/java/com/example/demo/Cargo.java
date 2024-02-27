package com.example.demo;

public class Cargo {
    private String descricao;
    private String Nivel;
    private Boolean condicionado;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String nivel) {
        Nivel = nivel;
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
                ", Nivel='" + Nivel + '\'' +
                ", condicionado=" + condicionado +
                '}';
    }
}
