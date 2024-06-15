package com.example.ponto.resource;

import com.example.ponto.models.domain.HorarioTrabalho;
import com.example.ponto.service.HorarioTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/horariotrabalho")
public class HorarioTrabalhoController {

    private final HorarioTrabalhoService service;

    @Autowired
    public HorarioTrabalhoController(HorarioTrabalhoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<HorarioTrabalho> create(@RequestBody HorarioTrabalho entity) {
        HorarioTrabalho save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/horariotrabalho/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity<List<HorarioTrabalho>> findAll() {
        List<HorarioTrabalho> horariotrabalho = service.buscaTodos();
        return ResponseEntity.ok(horariotrabalho);
    }

    @GetMapping("{id}")
    public ResponseEntity<HorarioTrabalho> findById(@PathVariable("id") Long id) {
        Optional<HorarioTrabalho> horariotrabalho = service.buscaPorId(id);
        return horariotrabalho
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<HorarioTrabalho> update(@PathVariable("id") Long id, @RequestBody HorarioTrabalho entity) {
        HorarioTrabalho alterado = service.alterar(id, entity);
        return ResponseEntity.ok(alterado);
    }
}
