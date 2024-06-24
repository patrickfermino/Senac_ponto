package com.example.ponto.service;

import com.example.ponto.enterprise.exception.NotFoundException;
import com.example.ponto.models.Funcionario;
import com.example.ponto.models.domain.HorarioTrabalho;
import com.example.ponto.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionariorepository;

    public Funcionario salvar (Funcionario entity){
        return funcionariorepository.save(entity);
    }
    public Page<Funcionario> buscaTodos(Pageable pageable) {
        var list = funcionariorepository.findAll(pageable);

        if (list.isEmpty()){
            throw new NotFoundException("Nenhum funcionario encontrado");
        }

        return list;
    }
    public Funcionario buscarPorId(Long id) {
        return funcionariorepository.findById(id).orElse(null);
    }
    public Funcionario alterar(Long id, Funcionario alterado){
        Optional<Funcionario> encontrado = funcionariorepository.findById(id);
        if (encontrado.isPresent()){
            Funcionario funcionario = encontrado.get();
            funcionario.setNome(alterado.getNome());
            funcionario.setCpf(alterado.getCpf());
            funcionario.setRg(alterado.getRg());
            funcionario.setEndereco(alterado.getEndereco());
            funcionario.setTituloEleitor(alterado.getTituloEleitor());
            funcionario.setTituloEleitor(alterado.getTituloEleitor());
            funcionario.setRegistroProfissional(alterado.getRegistroProfissional());
            funcionario.setSindicato(alterado.getSindicato());
            funcionario.setSetor(alterado.getSetor());
            funcionario.setCnh(alterado.getCnh());
            funcionario.setDataAdmissao(alterado.getDataAdmissao());
            funcionario.setCargo(alterado.getCargo());
            funcionario.setRacaCor(alterado.getRacaCor());
            funcionario.setReligiao(alterado.getReligiao());
            funcionario.setDoadorSangue(alterado.getDoadorSangue());
            funcionario.setNacionalidade(alterado.getNacionalidade());
            funcionario.setRedeSocial(alterado.getRedeSocial());
            funcionario.setAreaAtuacao(alterado.getAreaAtuacao());
            funcionario.setHoraExtra(alterado.getHoraExtra());
            funcionario.setHoraEntrada(alterado.getHoraEntrada());
            funcionario.setHoraSaida(alterado.getHoraSaida());
            funcionario.setEstadoCivil(alterado.getEstadoCivil());
            funcionario.setGenero(alterado.getGenero());
            funcionario.setModalidadeContratual(alterado.getModalidadeContratual());
            return funcionariorepository.save(funcionario);
        }
        return null;
    }
    public void remover(Long id) { funcionariorepository.deleteById(id);}
}