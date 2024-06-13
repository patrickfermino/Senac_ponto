
package com.example.ponto.service;

import com.example.ponto.model.RegistroPonto;
import com.example.ponto.repository.HorarioTrabalhoRepository;
import com.example.ponto.repository.RegistroPontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RegistroPontoService {


    private final RegistroPontoRepository repository;

    @Autowired
    public RegistroPontoService(RegistroPontoRepository repository) {
        this.repository = repository;
    }

    public RegistroPonto salvar (RegistroPonto entity){
        return repository.save(entity);
    }
    public List<RegistroPonto> buscaTodos(){
        return repository.findAll();
    }
    public RegistroPonto buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    public RegistroPonto alterar(Long id, RegistroPonto alterado){
        Optional<RegistroPonto> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            RegistroPonto registroPonto = encontrado.get();
            registroPonto.setTipoRegistro(alterado.getTipoRegistro());
            registroPonto.setHoraBatida(alterado.getHoraBatida());
            return repository.save(registroPonto);
        }
        return null;
    }
    public void remover(Long id) { repository.deleteById(id);}
}

