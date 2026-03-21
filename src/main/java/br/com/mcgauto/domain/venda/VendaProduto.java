package br.com.mcgauto.domain.venda;

import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.venda.enums.FormaPagamento;
import br.com.mcgauto.domain.venda.enums.StatusVenda;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Entity
@Table(name = "vendas_de_produtos")
public class VendaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_pedido", nullable = false, unique = true)
    private String codigoPedido;

    @Column(name = "numero_pedido", nullable = false, unique = true)
    private Integer numeroPedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Usuario cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendedor_id", nullable = false)
    private Usuario vendedor;

    @OneToMany(mappedBy = "vendaProduto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemVenda> itens = new ArrayList<>();

    @Column(name = "data_venda", nullable = false, updatable = false)
    private Instant dataVenda;

    @Column(name = "valor_total", nullable = false)
    private BigDecimal valorTotal;

    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pagamento")
    private FormaPagamento formaPagamento;

    private String observacoes;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_venda", nullable = false)
    private StatusVenda statusVenda;

    //Construtor
    public VendaProduto() {
    }

    @PrePersist
    public void prePersist() {
        if (this.dataVenda == null) {
            this.dataVenda = Instant.now();
        }
        if (this.statusVenda == null) {
            this.statusVenda = StatusVenda.PENDENTE_PAGAMENTO;
        }
        if (this.numeroPedido == null) {
            this.numeroPedido = ThreadLocalRandom.current().nextInt(100000, 999999);
        }
        if (this.codigoPedido == null) {
            this.codigoPedido = "GERAR-DEPOIS"; //Substituir com a lógica do Service
        }
    }

    public void adicionarItem(ItemVenda item) {
        this.itens.add(item);
        item.setVendaProduto(this);
    }

    public void removerItem(ItemVenda item) {
        this.itens.remove(item);
        item.setVendaProduto(null);
    }

    public Long getId() {
        return id;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
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

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public Instant getDataVenda() {
        return dataVenda;
    }

    // Set Data Venda geralmente não é exposto pois é imutável, mas caso seu mapper exija:
    public void setDataVenda(Instant dataVenda) {
        this.dataVenda = dataVenda;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public StatusVenda getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(StatusVenda statusVenda) {
        this.statusVenda = statusVenda;
    }

    @Override
    public String toString() {
        return "VendaProduto{" +
                "id=" + id +
                ", numeroPedido=" + numeroPedido +
                ", codigoPedido='" + codigoPedido + '\'' +
                ", valorTotal=" + valorTotal +
                ", statusVenda=" + statusVenda +
                '}';
    }
}