package com.example.ponto.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Funcionario extends EntityId{
  private String nome;
  private String cpf;
  private String rg;
  private String ctps;
  private Double salario;
  private Integer cargaHoraria;
  private ModalidadeContratual modalidadeContratual;
  private EstadoCivil estadoCivil;
  private String tituloEleitor;
  private String carteiraReservista;
  private LocalDate dataNascimento;
  private String pis;
  private String registroProfissional;
  private String sindicato;
  private String setor;
  private String cnh;
  private LocalDate dataAdmissao;
  private TipoRh tipoRh;
  private Cargo cargo;
  private Dependentes dependentes;
  private String racaCor;
  private String religiao;
  private Boolean doadorSangue;
  private String nacionalidade;
  private String redeSocial;
  private String areaAtuacao;
  private String idiomas;
  private Integer horaExtra;
  private LocalTime horaEntrada;
  private LocalTime horaSaida;
  private String endereco;
  private String certificacao;
  private String genero;
  private String escolaridade;

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getEscolaridade() {
    return escolaridade;
  }

  public void setEscolaridade(String escolaridade) {
    this.escolaridade = escolaridade;
  }

  public String getCertificacao() {
    return certificacao;
  }

  public void setCertificacao(String certificacao) {
    this.certificacao = certificacao;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getCtps() {
    return ctps;
  }

  public void setCtps(String ctps) {
    this.ctps = ctps;
  }

  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }

  public Integer getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(Integer cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  public ModalidadeContratual getModalidadeContratual() {
    return modalidadeContratual;
  }

  public void setModalidadeContratual(ModalidadeContratual modalidadeContratual) {
    this.modalidadeContratual = modalidadeContratual;
  }

  public EstadoCivil getEstadoCivil() {
    return estadoCivil;
  }

  public void setEstadoCivil(EstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public String getTituloEleitor() {
    return tituloEleitor;
  }

  public void setTituloEleitor(String tituloEleitor) {
    this.tituloEleitor = tituloEleitor;
  }

  public String getCarteiraReservista() {
    return carteiraReservista;
  }

  public void setCarteiraReservista(String carteiraReservista) {
    this.carteiraReservista = carteiraReservista;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getPis() {
    return pis;
  }

  public void setPis(String pis) {
    this.pis = pis;
  }

  public String getRegistroProfissional() {
    return registroProfissional;
  }

  public void setRegistroProfissional(String registroProfissional) {
    this.registroProfissional = registroProfissional;
  }

  public String getSindicato() {
    return sindicato;
  }

  public void setSindicato(String sindicato) {
    this.sindicato = sindicato;
  }

  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public String getCnh() {
    return cnh;
  }

  public void setCnh(String cnh) {
    this.cnh = cnh;
  }

  public LocalDate getDataAdmissao() {
    return dataAdmissao;
  }

  public void setDataAdmissao(LocalDate dataAdmissao) {
    this.dataAdmissao = dataAdmissao;
  }

  public TipoRh getTipoRh() {
    return tipoRh;
  }

  public void setTipoRh(TipoRh tipoRh) {
    this.tipoRh = tipoRh;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  public Dependentes getDependentes() {
    return dependentes;
  }

  public void setDependentes(Dependentes dependentes) {
    this.dependentes = dependentes;
  }

  public String getRacaCor() {
    return racaCor;
  }

  public void setRacaCor(String racaCor) {
    this.racaCor = racaCor;
  }

  public String getReligiao() {
    return religiao;
  }

  public void setReligiao(String religiao) {
    this.religiao = religiao;
  }

  public Boolean getDoadorSangue() {
    return doadorSangue;
  }

  public void setDoadorSangue(Boolean doadorSangue) {
    this.doadorSangue = doadorSangue;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public String getRedeSocial() {
    return redeSocial;
  }

  public void setRedeSocial(String redeSocial) {
    this.redeSocial = redeSocial;
  }

  public String getAreaAtuacao() {
    return areaAtuacao;
  }

  public void setAreaAtuacao(String areaAtuacao) {
    this.areaAtuacao = areaAtuacao;
  }

  public String getIdiomas() {
    return idiomas;
  }

  public void setIdiomas(String idiomas) {
    this.idiomas = idiomas;
  }

  public Integer getHoraExtra() {
    return horaExtra;
  }

  public void setHoraExtra(Integer horaExtra) {
    this.horaExtra = horaExtra;
  }

  public LocalTime getHoraEntrada() {
    return horaEntrada;
  }

  public void setHoraEntrada(LocalTime horaEntrada) {
    this.horaEntrada = horaEntrada;
  }

  public LocalTime getHoraSaida() {
    return horaSaida;
  }

  public void setHoraSaida(LocalTime horaSaida) {
    this.horaSaida = horaSaida;
  }

  @Override
  public String toString() {
    return "Funcionario{" +
            "nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            ", rg='" + rg + '\'' +
            ", ctps='" + ctps + '\'' +
            ", salario=" + salario +
            ", cargaHoraria=" + cargaHoraria +
            ", modalidadeContratual=" + modalidadeContratual +
            ", estadoCivil=" + estadoCivil +
            ", tituloEleitor='" + tituloEleitor + '\'' +
            ", carteiraReservista='" + carteiraReservista + '\'' +
            ", dataNascimento=" + dataNascimento +
            ", pis='" + pis + '\'' +
            ", registroProfissional='" + registroProfissional + '\'' +
            ", sindicato='" + sindicato + '\'' +
            ", setor='" + setor + '\'' +
            ", cnh='" + cnh + '\'' +
            ", dataAdmissao=" + dataAdmissao +
            ", tipoRh=" + tipoRh +
            ", cargo=" + cargo +
            ", dependentes=" + dependentes +
            ", racaCor='" + racaCor + '\'' +
            ", religiao='" + religiao + '\'' +
            ", doadorSangue=" + doadorSangue +
            ", nacionalidade='" + nacionalidade + '\'' +
            ", redeSocial='" + redeSocial + '\'' +
            ", areaAtuacao='" + areaAtuacao + '\'' +
            ", idiomas='" + idiomas + '\'' +
            ", horaExtra=" + horaExtra +
            ", horaEntrada=" + horaEntrada +
            ", horaSaida=" + horaSaida +
            ", endereco='" + endereco + '\'' +
            ", certificacao='" + certificacao + '\'' +
            ", genero='" + genero + '\'' +
            ", escolaridade='" + escolaridade + '\'' +
            '}';
  }
}
