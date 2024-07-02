package com.example.ponto.dto;

import java.util.List;
import java.util.stream.Collectors;

public class RelatorioDTO {

    private List<FuncionarioDTO> funcionarios;
    private HorarioTrabalhoDTO horarioTrabalho;
    private List<RegistroPontoDTO> registrosPonto;

    public RelatorioDTO() {
    }

    public RelatorioDTO(List<FuncionarioDTO> funcionarios, HorarioTrabalhoDTO horarioTrabalho, List<RegistroPontoDTO> registrosPonto) {
        this.funcionarios = funcionarios;
        this.horarioTrabalho = horarioTrabalho;
        this.registrosPonto = registrosPonto;
    }

    public List<FuncionarioDTO> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<FuncionarioDTO> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public HorarioTrabalhoDTO getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(HorarioTrabalhoDTO horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public List<RegistroPontoDTO> getRegistrosPonto() {
        return registrosPonto;
    }

    public void setRegistrosPonto(List<RegistroPontoDTO> registrosPonto) {
        this.registrosPonto = registrosPonto;
    }

    public static RelatorioDTO fromEntity(com.example.ponto.models.domain.Relatorio entity) {
        List<FuncionarioDTO> funcionariosDTO = entity.getFuncionarios().stream()
                .map(FuncionarioDTO::fromEntity)
                .collect(Collectors.toList());

        List<RegistroPontoDTO> registrosPontoDTO = entity.getRegistrosPonto().stream()
                .map(RegistroPontoDTO::fromEntity)
                .collect(Collectors.toList());

        return new RelatorioDTO(
                funcionariosDTO,
                HorarioTrabalhoDTO.fromEntity(entity.getHorarioTrabalho()),
                registrosPontoDTO
        );
    }

    @Override
    public String toString() {
        return "RelatorioDTO{" +
                "funcionarios=" + funcionarios +
                ", horarioTrabalho=" + horarioTrabalho +
                ", registrosPonto=" + registrosPonto +
                '}';
    }
}
