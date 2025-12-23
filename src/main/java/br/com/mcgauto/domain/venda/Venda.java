package br.com.mcgauto.domain.venda;

import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.venda.enums.StatusVenda;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "vendas")
public class Venda {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private int numeroPedido;
    private Usuario cliente;
    private Usuario vendedor;
    private Usuario gestorAprovador;
    private ItemVenda itemVenda;
    private LocalDateTime dataVenda;
    private BigDecimal valorVenda;
    private String formaPagamento;
    private StatusVenda statusVenda;
    private String observacoes;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

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
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                ", gestorAprovador=" + gestorAprovador +
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
