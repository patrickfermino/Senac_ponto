package com.example.ponto.service;

import com.example.ponto.models.Funcionario;
import com.example.ponto.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public Funcionario salvar (Funcionario entity){
        return repository.save(entity);
    }
    public List<Funcionario> buscaTodos(){
        return repository.findAll();
    }
    public Funcionario buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    public Funcionario alterar(Long id, Funcionario alterado){
        Optional<Funcionario> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Funcionario funcionario = encontrado.get();
            funcionario.setNome(alterado.getNome());
            funcionario.setCpf(alterado.getCpf());
            funcionario.setRg(alterado.getRg());
            funcionario.setEndereco(alterado.getEndereco());
            funcionario.setCtps(alterado.getCtps());
            funcionario.setSalario(alterado.getSalario());
            funcionario.setTituloEleitor(alterado.getTituloEleitor());
            funcionario.setTituloEleitor(alterado.getTituloEleitor());
            funcionario.setDataNascimento(alterado.getDataNascimento());
            funcionario.setCarteiraReservista(alterado.getCarteiraReservista());
            funcionario.setPis(alterado.getPis());
            funcionario.setRegistroProfissional(alterado.getRegistroProfissional());
            funcionario.setSindicato(alterado.getSindicato());
            funcionario.setSetor(alterado.getSetor());
            funcionario.setCnh(alterado.getCnh());
            funcionario.setDataAdmissao(alterado.getDataAdmissao());
            funcionario.setCargo(alterado.getCargo());
            funcionario.setRacaCor(alterado.getRacaCor());
            funcionario.setReligiao(alterado.getReligiao());
            funcionario.setDoadorSangue(alterado.getDoadorSangue());
            funcionario.setCertificacao(alterado.getCertificacao());
            funcionario.setNacionalidade(alterado.getNacionalidade());
            funcionario.setRedeSocial(alterado.getRedeSocial());
            funcionario.setAreaAtuacao(alterado.getAreaAtuacao());
            funcionario.setIdiomas(alterado.getIdiomas());
            funcionario.setHoraExtra(alterado.getHoraExtra());
            funcionario.setHoraEntrada(alterado.getHoraEntrada());
            funcionario.setHoraSaida(alterado.getHoraSaida());
            funcionario.setEscolaridade(alterado.getEscolaridade());
            funcionario.setEstadoCivil(alterado.getEstadoCivil());
            funcionario.setGenero(alterado.getGenero());
            funcionario.setModalidadeContratual(alterado.getModalidadeContratual());
            return repository.save(funcionario);
        }
        return null;
    }
    public void remover(Long id) { repository.deleteById(id);}
}