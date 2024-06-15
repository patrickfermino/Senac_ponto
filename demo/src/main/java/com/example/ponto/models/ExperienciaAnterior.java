package com.example.ponto.models;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class ExperienciaAnterior extends EntityId {

   private String descricao;
   private String cargo;
   private LocalDate periodoInicial;
   private LocalDate periodoFinal;

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public String getCargo() {
      return cargo;
   }

   public void setCargo(String cargo) {
      this.cargo = cargo;
   }

   public LocalDate getPeriodoInicial() {
      return periodoInicial;
   }

   public void setPeriodoInicial(LocalDate periodoInicial) {
      this.periodoInicial = periodoInicial;
   }

   public LocalDate getPeriodoFinal() {
      return periodoFinal;
   }

   public void setPeriodoFinal(LocalDate periodoFinal) {
      this.periodoFinal = periodoFinal;
   }

   @Override
   public String toString() {
      return "ExpAnterior{" +
              "descricao='" + descricao + '\'' +
              ", cargo='" + cargo + '\'' +
              ", PeriodoInicial=" + periodoInicial +
              ", PeriodoFinal=" + periodoFinal +
              '}';
   }
}
