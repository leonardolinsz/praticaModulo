package org.example.pratica.controller;

import jakarta.validation.Valid;
import org.example.pratica.model.ItemPedido;
import org.example.pratica.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ItemPedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService service;

    @GetMapping("/selecionar")
    public List<ItemPedido> listarItemPedidos(){
        return service.listarItemPedidos();
    }

    @PostMapping("/inserir")
    public ResponseEntity<String> InserirItemPedido(@RequestBody @Valid ItemPedido ItemPedido) {
        ItemPedido novoItemPedido = service.InserirItemPedido(ItemPedido);
        return ResponseEntity.ok("ItemPedido inserida no banco: " + novoItemPedido.getId());
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> excluirItemPedido(@PathVariable long id){
        long idExcluido = service.excluirItemPedido(id);
        return ResponseEntity.ok("Id do ItemPedido excluída: " + idExcluido);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<ItemPedido> atualizarItemPedido(@PathVariable long id, @RequestBody @Valid ItemPedido ItemPedido) {
        return ResponseEntity.ok(service.atualizarItemPedido(id, ItemPedido));
    }
}
