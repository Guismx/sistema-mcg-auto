package br.com.mcgauto.domain.venda;

import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.veiculo.Veiculo;
import br.com.mcgauto.domain.venda.enums.CanalVenda;
import br.com.mcgauto.domain.venda.enums.StatusVenda;
import br.com.mcgauto.domain.venda.enums.TipoVenda;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vendas")
public class Venda {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "numero_pedido", nullable = false, unique = true)
    private int numeroPedido;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_venda", nullable = false)
    private TipoVenda tipoVenda;

    @Enumerated(EnumType.STRING)
    @Column(name = "canal_venda", nullable = false)
    private CanalVenda canalVenda;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "cliente_id", nullable = false)
    private Usuario cliente;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "vendedor_id", nullable = false)
    private Usuario vendedor;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "gestor_aprovador_id")
    private Usuario gestorAprovador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;

    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemVenda> itens = new ArrayList<>();

    @Column (name = "data_venda", nullable = false)
    private LocalDateTime dataVenda;

    @Column (name = "valor_total", nullable = false)
    private BigDecimal valorTotal;

    @Column (name = "forma_pagamento")
    private String formaPagamento;

    private String observacoes;

    @CreationTimestamp
    @Column (name = "criado_em", nullable = false, updatable = false)
    private LocalDateTime criadoEm;

    @UpdateTimestamp
    @Column (name = "atualizado_em")
    private LocalDateTime atualizadoEm;

    @Enumerated (EnumType.STRING)
    @Column (name = "status_venda", nullable = false)
    private StatusVenda statusVenda;

    public Venda() {}

    //Venda Veículo
    public Venda(int numeroPedido, Usuario cliente, Usuario vendedor, Veiculo veiculo, CanalVenda canalVenda) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.veiculo = veiculo;
        this.canalVenda = canalVenda;
        this.tipoVenda = TipoVenda.VEICULO;
        this.dataVenda = LocalDateTime.now();
        this.statusVenda = StatusVenda.AGUARDANDO_APROVACAO;
        this.valorTotal = veiculo.getPrecoVenda();
    }

    //Venda Produto
    public Venda(int numeroPedido, Usuario cliente, Usuario vendedor, CanalVenda canalVenda) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.canalVenda = canalVenda;
        this.tipoVenda = TipoVenda.PRODUTO;
        this.dataVenda = LocalDateTime.now();
        this.statusVenda = StatusVenda.PENDENTE_PAGAMENTO;
        this.valorTotal = BigDecimal.ZERO;
    }

    //Métodos Auxiliares
    public void adicionarItem(ItemVenda item) {
        if (this.tipoVenda == TipoVenda.VEICULO) {
            throw new IllegalStateException("Não é possível adicionar itens avulsos em uma Venda de Veículo.");
        }
        this.itens.add(item);
        item.setVenda(this);
        //TODO: A soma do valorTotal deve ser chamada no Service após adicionar todos os itens
    }

    public void removerItem(ItemVenda item) {
        this.itens.remove(item);
        item.setVenda(null);
    }

    public long getId() {
        return id;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public TipoVenda getTipoVenda() {
        return tipoVenda;
    }

    public CanalVenda getCanalVenda() {
        return canalVenda;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public Usuario getGestorAprovador() {
        return gestorAprovador;
    }

    public void setGestorAprovador(Usuario gestorAprovador) {
        this.gestorAprovador = gestorAprovador;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
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
                ", pedido=" + numeroPedido +
                ", tipo=" + tipoVenda +
                ", canal=" + canalVenda +
                ", total=" + valorTotal +
                ", status=" + statusVenda +
                '}';
    }
}
