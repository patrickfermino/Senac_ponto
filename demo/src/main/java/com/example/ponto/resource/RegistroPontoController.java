package com.example.ponto.resource;
import com.example.ponto.models.domain.RegistroPonto;
import com.example.ponto.service.RegistroPontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/registroponto")
public class RegistroPontoController extends AbstractController{
    @Autowired
    private RegistroPontoService registroPontoservice;

    @PostMapping
    public ResponseEntity create(@RequestBody RegistroPonto entity) {
        RegistroPonto savedEntity = registroPontoservice.salvar(entity);
        URI uri = URI.create("/api/registroponto" + savedEntity.getId());
        return ResponseEntity.created(uri).body(savedEntity);
    }
    @GetMapping
    public  ResponseEntity findAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "1") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<RegistroPonto> registroPonto = registroPontoservice.buscaTodos(pageable);
        return ResponseEntity.ok(registroPonto);
    }
    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        RegistroPonto registroponto = registroPontoservice.buscaPorId(id);
        return ResponseEntity.ok(registroponto);
    }
    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        registroPontoservice.remover(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody RegistroPonto entity) {
        RegistroPonto alterado = registroPontoservice.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}



