package com.example.ponto.model;

import com.example.ponto.model.enums.EstadoCivil;
import com.example.ponto.model.enums.ModalidadeContratual;
import com.example.ponto.model.enums.TipoRh;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;



@Entity

public class Funcionario extends EntityId{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Id_Funcionario", nullable = false)
  private Long id;

  @Column(name = "Nome", nullable = false)
  private String nome;

  @Column(name = "CPF", nullable = false)
  private String cpf;

  @Column(name = "RG", nullable = false)
  private String rg;

  @Column(name = "CTPS", nullable = false)
  private String ctps;

  @Column(name = "Salario", nullable = false)
  private Double salario;

  @Column(name = "Carga_Horaria", nullable = false)
  private Integer cargaHoraria;

  @Column(name = "Modalidade_Contratual", nullable = false)
  private ModalidadeContratual modalidadeContratual;

  @Column(name = "Estado_Civil", nullable = false)
  private EstadoCivil estadoCivil;

  @Column(name = "Titulo_Eleitor", nullable = false)
  private String tituloEleitor;

  @Column(name = "Carteira_Reservista", nullable = false)
  private String carteiraReservista;

  @Column(name = "Data_Nascimento", nullable = false)
  private LocalDate dataNascimento;

  @Column(name = "PIS", nullable = false)
  private String pis;

  @Column(name = "Registro_Profissional", nullable = false)
  private String registroProfissional;

  @Column(name = "Sindicato", nullable = false)
  private String sindicato;

  @Column(name = "Setor", nullable = false)
  private String setor;

  @Column(name = "CNH", nullable = false)
  private String cnh;

  @Column(name = "Data_Admissao", nullable = false)
  private LocalDate dataAdmissao;

  @Column(name = "Tipo_Rh", nullable = false)
  private TipoRh tipoRh;

  @Column(name = "Cargo", nullable = false)
  private Cargo cargo;

  @Column(name = "Dependentes", nullable = false)
  private Dependente dependentes;

  @Column(name = "Raca_Cor", nullable = false)
  private String racaCor;

  @Column(name = "Religiao", nullable = false)
  private String religiao;

  @Column(name = "Doador_Sangue", nullable = false)
  private Boolean doadorSangue;

  @Column(name = "Nacionalidade", nullable = false)
  private String nacionalidade;

  @Column(name = "RedeSocial", nullable = false)
  private String redeSocial;

  @Column(name = "Area_Atuacao", nullable = false)
  private String areaAtuacao;

  @Column(name = "Idiomas", nullable = false)
  private String idiomas;

  @Column(name = "Hora_Extra", nullable = false)
  private Integer horaExtra;

  @Column(name = "Hora_Entrada", nullable = false)
  private LocalTime horaEntrada;

  @Column(name = "Hora_Saida", nullable = false)
  private LocalTime horaSaida;

  @Column(name = "Endereco", nullable = false)
  private String endereco;

  @Column(name = "Certificado", nullable = false)
  private String certificacao;

  @Column(name = "Genero", nullable = false)
  private String genero;

  @Column(name = "Escolaridade", nullable = false)
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

  public Cargo getCargo() {
    return cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  public Dependente getDependentes() {
    return dependentes;
  }

  public void setDependenyt(Dependente dependentes) {
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
