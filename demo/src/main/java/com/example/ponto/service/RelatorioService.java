package com.example.ponto.service;

import com.example.ponto.dto.FuncionarioDTO;
import com.example.ponto.dto.HorarioTrabalhoDTO;
import com.example.ponto.dto.RegistroPontoDTO;
import com.example.ponto.dto.RelatorioDTO;
import com.example.ponto.models.domain.Relatorio;
import com.example.ponto.repository.FuncionarioRepository;
import com.example.ponto.repository.RelatorioRepository;
import com.example.ponto.repository.RegistroPontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RelatorioService {

    @Autowired
    private RelatorioRepository relatorioRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private RegistroPontoRepository registroPontoRepository;

    public String exportarRelatorioXML(Long relatorioId) throws JAXBException {
        Relatorio relatorio = relatorioRepository.findById(relatorioId)
                .orElseThrow(() -> new IllegalArgumentException("Relatório não encontrado para o ID fornecido: " + relatorioId));

        List<FuncionarioDTO> funcionariosDTO = relatorio.getFuncionarios().stream()
                .map(FuncionarioDTO::fromEntity)
                .collect(Collectors.toList());

        RelatorioDTO relatorioDTO = new RelatorioDTO(
                funcionariosDTO,
                relatorio.getHorarioTrabalho() != null ? HorarioTrabalhoDTO.fromEntity(relatorio.getHorarioTrabalho()) : null,
                relatorio.getRegistrosPonto().stream()
                        .map(RegistroPontoDTO::fromEntity)
                        .collect(Collectors.toList())
        );

        return convertToXML(relatorioDTO);
    }

    private String convertToXML(RelatorioDTO relatorioDTO) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(RelatorioDTO.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter sw = new StringWriter();
        marshaller.marshal(relatorioDTO, sw);

        return sw.toString();
    }
}
