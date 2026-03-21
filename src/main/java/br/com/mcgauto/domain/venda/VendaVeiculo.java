package br.com.mcgauto.domain.venda;

import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.veiculo.Veiculo;
import br.com.mcgauto.domain.venda.enums.CanalVenda;
import br.com.mcgauto.domain.venda.enums.FormaPagamento;
import br.com.mcgauto.domain.venda.enums.StatusVenda;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.concurrent.ThreadLocalRandom;

@Entity
@Table(name = "vendas_de_veiculos")
public class VendaVeiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_pedido", nullable = false, unique = true)
    private String codigoPedido;

    @Column(name = "numero_pedido", nullable = false, unique = true)
    private Integer numeroPedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Usuario cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendedor_id", nullable = false)
    private Usuario vendedor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aprovador_id")
    private Usuario aprovador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "veiculo_id", nullable = false)
    private Veiculo veiculo;

    @Column(name = "data_venda", nullable = false, updatable = false)
    private Instant dataVenda;

    @Column(name = "valor_total", nullable = false)
    private BigDecimal valorTotal;

    @Enumerated(EnumType.STRING)
    @Column(name = "canal_venda")
    private CanalVenda canalVenda;

    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pagamento")
    private FormaPagamento formaPagamento;

    private String observacoes;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_venda", nullable = false)
    private StatusVenda statusVenda;

    //Construtor vazio para JPA e MapStruct
    public VendaVeiculo() {
    }

    @PrePersist
    public void prePersist() {
        if (this.dataVenda == null) {
            this.dataVenda = Instant.now();
        }
        if (this.statusVenda == null) {
            this.statusVenda = StatusVenda.AGUARDANDO_APROVACAO;
        }
        if (this.numeroPedido == null) {
            this.numeroPedido = ThreadLocalRandom.current().nextInt(100000, 999999);
        }
        if (this.codigoPedido == null) {
            this.codigoPedido = "GERAR-DEPOIS"; //Substituir pela lógica do service
        }
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

    public Usuario getAprovador() {
        return aprovador;
    }

    public void setAprovador(Usuario aprovador) {
        this.aprovador = aprovador;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Instant getDataVenda() {
        return dataVenda;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public CanalVenda getCanalVenda() {
        return canalVenda;
    }

    public void setCanalVenda(CanalVenda canalVenda) {
        this.canalVenda = canalVenda;
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
        return "VendaVeiculo{" +
                "id=" + id +
                ", numeroPedido=" + numeroPedido +
                ", codigoPedido='" + codigoPedido + '\'' +
                ", canalVenda=" + canalVenda +
                ", valorTotal=" + valorTotal +
                ", statusVenda=" + statusVenda +
                '}';
    }
}
