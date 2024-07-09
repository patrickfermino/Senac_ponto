package com.example.ponto.resource;

import com.example.ponto.dto.RelatorioDTO;
import com.example.ponto.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/relatorios")
public class RelatorioController extends AbstractController {

    @Autowired
    private RelatorioService relatorioService;

    @GetMapping
    public ResponseEntity<List<RelatorioDTO>> listarRelatorio() {
        List<RelatorioDTO> relatorios = relatorioService.listarRelatorios();
        return ResponseEntity.ok(relatorios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RelatorioDTO> buscarRelatorioPorId(@PathVariable Long id) {
        RelatorioDTO relatorios = relatorioService.buscarRelatorioPorId(id);
        if (relatorios != null) {
            return ResponseEntity.ok(relatorios);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<RelatorioDTO> adicionarRelatorio(@RequestBody RelatorioDTO relatorioDTO) {
        RelatorioDTO novoRelatorio = relatorioService.adicionarRelatorio(relatorioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoRelatorio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RelatorioDTO> atualizarRelatorio(@PathVariable Long id, @RequestBody RelatorioDTO relatorioDTO) {
        RelatorioDTO relatorioAtualizado = relatorioService.atualizarRelatorio(id, relatorioDTO);
        if (relatorioAtualizado != null) {
            return ResponseEntity.ok(relatorioAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarRelatorio(@PathVariable Long id) {
        boolean deleted = relatorioService.deletarRelatorio(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
