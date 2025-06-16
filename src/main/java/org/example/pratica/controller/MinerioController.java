package org.example.pratica.controller;

import org.example.pratica.model.Minerio;
import org.example.pratica.service.MinerioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/minerio")
public class MinerioController {

    @Autowired
    private MinerioService minerioService;

    @GetMapping("/selecionar")
    public List<Minerio> listarMinerios() {
        return minerioService.getMinerio();
    }

    @GetMapping("/selecionar/{id}")
    public Optional<Minerio> selecionarMinerio(@PathVariable Long id) {
        return minerioService.getMinerioById(id);
    }

    @PostMapping("/inserir")
    public ResponseEntity<Minerio> inserirMinerio(@RequestBody Minerio minerio) {
        return ResponseEntity.status(HttpStatus.CREATED).body(minerioService.inserirMinerio(minerio));
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> atualizarMinerio(@PathVariable Long id, @RequestBody Minerio minerio) {
        minerioService.atualizarMinerio(id, minerio);
        return ResponseEntity.status(HttpStatus.CREATED).body("Minerio atualizado com sucesso!");
    }

    @DeleteMapping
    public ResponseEntity<String> deletarMinerio(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Minerio deletado com sucesso!");
    }
}
