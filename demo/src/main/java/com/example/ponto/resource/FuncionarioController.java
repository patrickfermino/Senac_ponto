package com.example.ponto.resource;

import com.example.ponto.models.Funcionario;
import com.example.ponto.models.domain.HorarioTrabalho;
import com.example.ponto.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController extends AbstractController {

    @Autowired
    private FuncionarioService funcionarioservice;

    @PostMapping
    public ResponseEntity<Funcionario> create(@RequestBody Funcionario funcionario) {
        Funcionario savedFuncionario = funcionarioservice.salvar(funcionario);
        return ResponseEntity.created(URI.create("/api/funcionarios/" + savedFuncionario.getId())).body(savedFuncionario);
    }

    @GetMapping
    public  ResponseEntity findAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "1") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Funcionario> funcionario = funcionarioservice.buscaTodos(pageable);
        return ResponseEntity.ok(funcionario);
    }

    @GetMapping("{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable("id") Long id) {
        Funcionario funcionario = funcionarioservice.buscarPorId(id);
        if (funcionario != null) {
            return ResponseEntity.ok(funcionario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> remove(@PathVariable("id") Long id) {
        funcionarioservice.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Funcionario> update(@PathVariable("id") Long id, @RequestBody Funcionario funcionario) {
        Funcionario funcionarioAtualizado = funcionarioservice.alterar(id, funcionario);
        if (funcionarioAtualizado != null) {
            return ResponseEntity.ok(funcionarioAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
