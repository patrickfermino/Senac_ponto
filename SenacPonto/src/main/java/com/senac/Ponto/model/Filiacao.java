package com.senac.Ponto.model;

public class Filiacao {
    private String telefone;
    private String mae;
    private String pai;
    private String telpai;
    private String telMae;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getTelpai() {
        return telpai;
    }

    public void setTelpai(String telpai) {
        this.telpai = telpai;
    }

    public String getTelMae() {
        return telMae;
    }

    public void setTelMae(String telMae) {
        this.telMae = telMae;
    }

    @Override
    public String toString() {
        return "Filiacao{" +
                "telefone='" + telefone + '\'' +
                ", mae='" + mae + '\'' +
                ", pai='" + pai + '\'' +
                ", telpai='" + telpai + '\'' +
                ", telMae='" + telMae + '\'' +
                '}';
    }
}
