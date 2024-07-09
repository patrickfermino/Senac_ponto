package com.example.ponto.dto;

import com.example.ponto.models.Funcionario;
import com.example.ponto.models.domain.HorarioTrabalho;
import com.example.ponto.models.domain.RegistroPonto;
import com.example.ponto.models.domain.Relatorio;

import java.util.List;
import java.util.stream.Collectors;

public class RelatorioDTO {

    private Long id;
    private List<FuncionarioDTO> funcionarios;
    private HorarioTrabalhoDTO horarioTrabalho;
    private List<RegistroPontoDTO> registrosPonto;

    public RelatorioDTO() {
    }

    public RelatorioDTO(Long id, List<FuncionarioDTO> funcionarios, HorarioTrabalhoDTO horarioTrabalho, List<RegistroPontoDTO> registrosPonto) {
        this.id = id;
        this.funcionarios = funcionarios;
        this.horarioTrabalho = horarioTrabalho;
        this.registrosPonto = registrosPonto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public static RelatorioDTO fromEntity(Relatorio entity) {
        List<FuncionarioDTO> funcionariosDTO = entity.getFuncionarios().stream()
                .map(FuncionarioDTO::fromEntity)
                .collect(Collectors.toList());

        List<RegistroPontoDTO> registrosPontoDTO = entity.getRegistrosPonto().stream()
                .map(RegistroPontoDTO::fromEntity)
                .collect(Collectors.toList());

        return new RelatorioDTO(
                entity.getId(),
                funcionariosDTO,
                HorarioTrabalhoDTO.fromEntity(entity.getHorarioTrabalho()),
                registrosPontoDTO
        );
    }

    public Relatorio toEntity(List<Funcionario> funcionarios, HorarioTrabalho horarioTrabalho, List<RegistroPonto> registrosPonto) {
        Relatorio relatorio = new Relatorio();
        relatorio.setId(this.id);
        relatorio.setFuncionarios(funcionarios);
        relatorio.setHorarioTrabalho(horarioTrabalho);
        relatorio.setRegistrosPonto(registrosPonto);
        return relatorio;
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
