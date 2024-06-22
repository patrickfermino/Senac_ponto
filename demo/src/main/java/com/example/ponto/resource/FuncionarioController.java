package com.example.ponto.resource;

import com.example.ponto.models.Funcionario;
import com.example.ponto.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @PostMapping
    public ResponseEntity<Funcionario> create(@RequestBody Funcionario funcionario) {
        Funcionario savedFuncionario = service.salvar(funcionario);
        return ResponseEntity.created(URI.create("/api/funcionarios/" + savedFuncionario.getId())).body(savedFuncionario);
    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll() {
        List<Funcionario> funcionarios = service.buscarTodos();
        return ResponseEntity.ok(funcionarios);
    }

    @GetMapping("{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable("id") Long id) {
        Funcionario funcionario = service.buscarPorId(id);
        if (funcionario != null) {
            return ResponseEntity.ok(funcionario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Funcionario> update(@PathVariable("id") Long id, @RequestBody Funcionario funcionario) {
        Funcionario funcionarioAtualizado = service.alterar(id, funcionario);
        if (funcionarioAtualizado != null) {
            return ResponseEntity.ok(funcionarioAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
