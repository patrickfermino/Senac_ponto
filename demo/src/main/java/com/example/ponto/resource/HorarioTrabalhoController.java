package com.example.ponto.resource;

import com.example.ponto.model.Funcionario;
import com.example.ponto.repository.FuncionarioRepository;
import com.example.ponto.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/horariotrabalho")
public class HorarioTrabalhoController {
    @Autowired
    private HorarioTrabalhoService service;
    @PostMapping
    public ResponseEntity create(@RequestBody HorarioTrabalho entity) {
        HorarioTrabalho save = service.salvar(entity);
        return ResponseEntity.created(URI.create("api/horariotrabalho/" + entity.getId())).body(save);
    }
    @GetMapping
    public ResponseEntity findAll() {
        List<HorarioTrabalho> horariotrabalho = service.buscaTodos();
        return ResponseEntity.ok(horariotrabalho);
    }
    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        HorarioTrabalho horariotrabalho = service.buscaPorId(id);
        return ResponseEntity.ok(horariotrabalho);
    }
    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody HorarioTrabalho entity) {
        HorarioTrabalho alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
