package org.example.pratica.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import java.math.BigDecimal;

@Entity
@Table(name = "mina")
public class Mina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, unique = true, nullable = false)
    private String nome;

    @Column(length = 100, nullable = false)
    private String localizacao;

    @DecimalMin(value = "0.01")
    @Column(nullable = false)
    private BigDecimal capacidade_extracao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public BigDecimal getCapacidade_extracao() {
        return capacidade_extracao;
    }

    public void setCapacidade_extracao(BigDecimal capacidade_extracao) {
        this.capacidade_extracao = capacidade_extracao;
    }
}
