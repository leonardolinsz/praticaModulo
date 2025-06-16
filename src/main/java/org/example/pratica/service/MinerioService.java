package org.example.pratica.service;

import jakarta.persistence.EntityNotFoundException;
import org.example.pratica.model.Minerio;
import org.example.pratica.repository.MinerioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class MinerioService {

    @Autowired
    private MinerioRepository minerioRepository;

    public List<Minerio> getMinerio() {
        return minerioRepository.findAll();
    }
    
    public Optional<Minerio> getMinerioById(Long id) {
        return minerioRepository.findById(id);
    }

    public Minerio inserirMinerio(Minerio minerio) {
        if (minerio.getNome() == null || minerio.getDescricao() == null || minerio.getPreco() == null || minerio.getEstoque() == null) {
            throw new IllegalArgumentException("Há campos vázios!");
        }
        return minerioRepository.save(minerio);
    }

    public Minerio atualizarMinerio( Long id,Minerio minerioAtualizar) {
        Minerio minerio = minerioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Minerio não encontrado!"));
        minerio.setNome(minerioAtualizar.getNome());
        minerio.setDescricao(minerioAtualizar.getDescricao());
        minerio.setPreco(minerioAtualizar.getPreco());
        minerio.setEstoque(minerioAtualizar.getEstoque());
        return minerioRepository.save(minerio);
    }

    public Minerio deletarMinerio(Long id) {
        Minerio minerio = minerioRepository.findById(id)
                .orElseThrow(() -> new  EntityNotFoundException("Minerio não encontrado!"));
        minerioRepository.deleteById(id);
        return minerio;
    }




}
