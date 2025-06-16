package org.example.pratica.controller;

import jakarta.validation.Valid;
import org.example.pratica.model.Mina;
import org.example.pratica.service.MinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mina")
public class MinaController {

    @Autowired
    private MinaService service;

    @GetMapping("/selecionar")
    public List<Mina> listarMinas(){
        return service.listarMinas();
    }

    @PostMapping("/inserir")
    public ResponseEntity<String> InserirMina(@RequestBody @Valid Mina Mina) {
        Mina novoMina = service.InserirMina(Mina);
        return ResponseEntity.ok("Mina inserida no banco: " + novoMina.getId());
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> excluirMina(@PathVariable long id){
        long idExcluido = service.excluirMina(id);
        return ResponseEntity.ok("Id do Mina excluída: " + idExcluido);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Mina> atualizarMina(@PathVariable long id, @RequestBody @Valid Mina Mina) {
        return ResponseEntity.ok(service.atualizarMina(id, Mina));
    }
}