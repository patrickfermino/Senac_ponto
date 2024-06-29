package com.example.ponto.dto;

import com.example.ponto.models.Funcionario;
import com.example.ponto.models.domain.Relatorio;

public class RelatorioDTO {

    private FuncionarioDTO funcionario;
    private HorarioTrabalhoDTO horarioTrabalho;
    private RegistroPontoDTO registroPonto;

    public RelatorioDTO() {
    }

    public RelatorioDTO(FuncionarioDTO funcionario, HorarioTrabalhoDTO horarioTrabalho, RegistroPontoDTO registroPonto) {
        this.funcionario = funcionario;
        this.horarioTrabalho = horarioTrabalho;
        this.registroPonto = registroPonto;
    }

    public FuncionarioDTO getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioDTO funcionario) {
        this.funcionario = funcionario;
    }

    public HorarioTrabalhoDTO getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(HorarioTrabalhoDTO horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public RegistroPontoDTO getRegistroPonto() {
        return registroPonto;
    }

    public void setRegistroPonto(RegistroPontoDTO registroPonto) {
        this.registroPonto = registroPonto;
    }

    public static RelatorioDTO fromEntity(Relatorio entity) {
        return new RelatorioDTO(
                FuncionarioDTO.fromEntity(entity.getFuncionario()),
                HorarioTrabalhoDTO.fromEntity(entity.getHorarioTrabalho()),
                RegistroPontoDTO.fromEntity(entity.getRegistroPonto())
        );
    }
}
