package org.example.pratica.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import org.hibernate.annotations.Check;

import java.util.ArrayList;

@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    private PedidoExtracao pedido_id;

    @ManyToOne
    @JoinColumn(name = "minerio_id", referencedColumnName = "id")
    private Minerio minerio_id;

    @DecimalMin(value = "0.01", message="Quantidade deve ser maior que zero")
    private Double quantidade;

    @DecimalMin(value = "0.01", message="Valor deve ser maior que zero")
    private Double preco_unitario;
    private Double subtotal;

    public ItemPedido() {

    }

    public ItemPedido(PedidoExtracao pedido_id, Minerio minerio_id, Double quantidade, Double preco_unitario) {
        this.pedido_id = pedido_id;
        this.minerio_id = minerio_id;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
        this.subtotal = quantidade * preco_unitario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PedidoExtracao getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(PedidoExtracao pedido_id) {
        this.pedido_id = pedido_id;
    }

    public Minerio getMinerio_id() {
        return minerio_id;
    }

    public void setMinerio_id(Minerio minerio_id) {
        this.minerio_id = minerio_id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(Double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }


}
