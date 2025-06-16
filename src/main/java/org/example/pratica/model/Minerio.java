package org.example.pratica.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "minerio")
public class Minerio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "O nome do minério não pode ser nulo.")
    private String nome;

    @NotBlank(message = "A descrição não pode ser nula.")
    private String descricao;

    @NotNull(message = "O preço não pode ser nulo.")
    @DecimalMin(value = "0.0", inclusive = false, message = "O preço deve ser maior que zero.")
    private Double preco;

    @NotNull(message = "O estoque não pode ser nulo.")
    @DecimalMin(value = "0.0", inclusive = true, message = "O estoque deve ser maior ou igual a que zero.")
    private Double estoque;

    public Minerio(Long id, String nome, String descricao, Double preco, Double estoque) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Minerio() {

    }

    @Override
    public String toString() {
        return "Minerio{" +
                "id:" + id +
                "nome: '" + nome + '\'' +
                "descricao: '" + descricao + '\'' +
                "preco: " + preco +
                "estoque: " + estoque+"}";
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getEstoque() {
        return estoque;
    }

    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }
}
