package org.example.pratica.service;

import jakarta.persistence.EntityNotFoundException;
import org.example.pratica.model.Mina;
import org.example.pratica.repository.MinaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MinaService {

    private final MinaRepository minaRepository;

    public MinaService(MinaRepository minaRepository) {
        this.minaRepository = minaRepository;
    }

    public List<Mina> listarMinas(){
        return minaRepository.findAll();
    }

    public Mina InserirMina(Mina Mina) {
        return minaRepository.save(Mina);
    }

    public long excluirMina(long id){
        if (id > -1){
            minaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Mina não encontrado") );
            minaRepository.deleteById(id);
            return id;
        }
        return -1;
    }

    public Mina atualizarMina(long id, Mina Mina) {
        Optional<Mina> MinaExistente = minaRepository.findById(id);

        if (!MinaExistente.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            Mina Mina1 = MinaExistente.get();
            Mina1.setNome(Mina.getNome());
            Mina1.setLocalizacao(Mina.getLocalizacao());
            Mina1.setCapacidade_extracao(Mina.getCapacidade_extracao());
            minaRepository.save(Mina1);
            return MinaExistente.get();
        }
    }
    
    public Mina buscarMinaPorId(long id) {
        Optional<Mina> MinaExistente = minaRepository.findById(id);

        if (MinaExistente.isPresent()) {
            return MinaExistente.get();
        } else {
            throw new EntityNotFoundException();
        }
    }
}

