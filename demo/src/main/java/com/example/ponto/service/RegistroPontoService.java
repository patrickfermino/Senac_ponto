
package com.example.ponto.service;

import com.example.ponto.enterprise.exception.NotFoundException;
import com.example.ponto.models.domain.RegistroPonto;
import com.example.ponto.repository.RegistroPontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroPontoService {

    private final RegistroPontoRepository registroPontoRepositoryrepository;

    @Autowired
    public RegistroPontoService(RegistroPontoRepository repository) {
        this.registroPontoRepositoryrepository = repository;
    }

    public RegistroPonto salvar (RegistroPonto entity){
        return registroPontoRepositoryrepository.save(entity);
    }
    public  Page<RegistroPonto> buscaTodos(Pageable pageable) {
        var list = registroPontoRepositoryrepository.findAll(pageable);

        if (list.isEmpty()){
            throw new NotFoundException("Nenhum registro de ponto encontrado");
        }

        return list;
    }
    public RegistroPonto buscaPorId(Long id) {
        return registroPontoRepositoryrepository.findById(id).orElse(null);
    }
    public RegistroPonto alterar(Long id, RegistroPonto alterado){
        Optional<RegistroPonto> encontrado = registroPontoRepositoryrepository.findById(id);
        if (encontrado.isPresent()){
            RegistroPonto registroPonto = encontrado.get();
            registroPonto.setTipoRegistro(alterado.getTipoRegistro());
            registroPonto.setHoraPonto(alterado.getHoraPonto());
            return registroPontoRepositoryrepository.save(registroPonto);
        }
        return null;
    }
    public void remover(Long id) { registroPontoRepositoryrepository.deleteById(id);}
}

