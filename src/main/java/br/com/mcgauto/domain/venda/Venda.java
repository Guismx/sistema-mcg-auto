package br.com.mcgauto.domain.venda;

import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.venda.enums.StatusVenda;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "vendas")
public class Venda {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "numero_pedido", nullable = false)
    private int numeroPedido;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "cliente_id", nullable = false)
    private Usuario cliente;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "vendedor_id", nullable = false)
    private Usuario vendedor;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "gestor_aprovador_id", nullable = false)
    private Usuario gestorAprovador;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "item_venda_id", nullable = false)
    private ItemVenda itemVenda;
    @Column (name = "data_venda", nullable = false)
    private LocalDateTime dataVenda;
    @Column (name = "valor_venda", nullable = false)
    private BigDecimal valorVenda;
    @Column (name = "forma_pagamento")
    private String formaPagamento;
    private String observacoes;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
    @Enumerated (EnumType.STRING)
    @Column (name = "status_venda", nullable = false)
    private StatusVenda statusVenda;

    public Venda() {}

    public Venda(long id, int numeroPedido, Usuario cliente, Usuario vendedor, Usuario gestorAprovador,
                 ItemVenda itemVenda, LocalDateTime dataVenda, BigDecimal valorVenda, String formaPagamento,
                 StatusVenda statusVenda, String observacoes, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.id = id;
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.gestorAprovador = gestorAprovador;
        this.itemVenda = itemVenda;
        this.dataVenda = dataVenda;
        this.valorVenda = valorVenda;
        this.formaPagamento = formaPagamento;
        this.statusVenda = statusVenda;
        this.observacoes = observacoes;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
    }

    public long getId() {
        return id;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public Usuario getGestorAprovador() {
        return gestorAprovador;
    }

    public void setGestorAprovador(Usuario gestorAprovador) {
        this.gestorAprovador = gestorAprovador;
    }

    public ItemVenda getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(ItemVenda itemVenda) {
        this.itemVenda = itemVenda;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public StatusVenda getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(StatusVenda statusVenda) {
        this.statusVenda = statusVenda;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", numeroPedido=" + numeroPedido +
                ", cliente=" + (cliente != null ? cliente.getNome() : null) +
                ", vendedor=" + (vendedor != null ? vendedor.getNome() : null) +
                ", gestorAprovador=" + (gestorAprovador != null ? gestorAprovador.getNome() : null) +
                ", itemVenda=" + itemVenda +
                ", dataVenda=" + dataVenda +
                ", valorVenda=" + valorVenda +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", statusVenda=" + statusVenda +
                ", observacoes='" + observacoes + '\'' +
                ", criadoEm=" + criadoEm +
                ", atualizadoEm=" + atualizadoEm +
                '}';
    }
}
