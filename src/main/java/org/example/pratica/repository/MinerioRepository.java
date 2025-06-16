package org.example.pratica.repository;

import org.example.pratica.model.Minerio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinerioRepository extends JpaRepository<Minerio, Long> {

}
