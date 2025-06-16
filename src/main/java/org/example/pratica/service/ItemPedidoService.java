package org.example.pratica.service;

import jakarta.persistence.EntityNotFoundException;
import org.example.pratica.model.ItemPedido;
import org.example.pratica.repository.ItemPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemPedidoService {
    private final ItemPedidoRepository itemPedidoRepository;

    public ItemPedidoService(ItemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository = itemPedidoRepository;
    }

    public List<ItemPedido> listarItemPedidos(){
        return ItemPedidoRepository.findAll();
    }

    public ItemPedido InserirItemPedido(ItemPedido ItemPedido) {
        return ItemPedidoRepository.save(ItemPedido);
    }

    public long excluirItemPedido(long id){
        if (id > -1){
            ItemPedidoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("ItemPedido não encontrado") );
            ItemPedidoRepository.deleteById(id);
            return id;
        }
        return -1;
    }

    public ItemPedido atualizarItemPedido(long id, ItemPedido ItemPedido) {
        Optional<ItemPedido> ItemPedidoExistente = ItemPedidoRepository.findById(id);

        if (!ItemPedidoExistente.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            ItemPedido ItemPedido1 = ItemPedidoExistente.get();
            ItemPedido1.setNome(ItemPedido.getNome());
            ItemPedido1.setLocalizacao(ItemPedido.getLocalizacao());
            ItemPedido1.setCapacidade_extracao(ItemPedido.getCapacidade_extracao());
            ItemPedidoRepository.save(ItemPedido1);
            return ItemPedidoExistente.get();
        }
    }

    public ItemPedido buscarItemPedidoPorId(long id) {
        Optional<ItemPedido> ItemPedidoExistente = ItemPedidoRepository.findById(id);

        if (ItemPedidoExistente.isPresent()) {
            return ItemPedidoExistente.get();
        } else {
            throw new EntityNotFoundException();
        }
    }
}
