package com.example.ponto.resource;
import com.example.ponto.model.RegistroPonto;
import com.example.ponto.service.RegistroPontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/registroponto")
public class RegistroPontoController {
    @Autowired
    private RegistroPontoService service;

    @PostMapping
    public ResponseEntity create(@RequestBody RegistroPonto entity) {
        RegistroPonto savedEntity = service.salvar(entity);
        URI uri = URI.create("/api/registroponto" + savedEntity.getId());
        return ResponseEntity.created(uri).body(savedEntity);
    }
    @GetMapping
    public ResponseEntity findAll() {
        List<RegistroPonto> registroponto = service.buscaTodos();
        return ResponseEntity.ok(registroponto);
    }
    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        RegistroPonto registroponto = service.buscaPorId(id);
        return ResponseEntity.ok(registroponto);
    }
    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody RegistroPonto entity) {
        RegistroPonto alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}



