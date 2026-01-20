package br.com.mcgauto.domain.financeiro;

import br.com.mcgauto.domain.agenda.Aluguel;
import br.com.mcgauto.domain.financeiro.enums.StatusPagamento;
import br.com.mcgauto.domain.financeiro.enums.TipoOrigem;
import br.com.mcgauto.domain.financeiro.enums.TipoPagamento;
import br.com.mcgauto.domain.servico.OrdemServico;
import br.com.mcgauto.domain.venda.Venda;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "pagamentos")
public class Pagamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "venda_id")
    private Venda venda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluguel_id")
    private Aluguel aluguel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ordem_servico_id")
    private OrdemServico ordemServico;

    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_origem", nullable = false)
    private TipoOrigem tipoOrigem;

    @Column (name = "data_pagamento", nullable = false, updatable = false)
    private LocalDateTime dataPagamento;

    @Column (name = "valor_pago", nullable = false)
    private BigDecimal valorPago;

    @Enumerated (EnumType.STRING)
    @Column (name = "forma_pagamento", nullable = false)
    private TipoPagamento formaPagamento;

    @Enumerated (EnumType.STRING)
    @Column (name = "status_pagamento", nullable = false)
    private StatusPagamento statusPagamento;

    @Column (name = "transacao_gateway")
    private String transacaoGateway;

    private int parcelas;


    public Pagamento() {
    }

    public Pagamento(Venda venda, BigDecimal valorPago, TipoPagamento formaPagamento, int parcelas) {
        this.venda = venda;
        this.tipoOrigem = TipoOrigem.VENDA;
        this.valorPago = valorPago;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.statusPagamento = StatusPagamento.PENDENTE;
    }

    public Pagamento(Aluguel aluguel, BigDecimal valorPago, TipoPagamento formaPagamento, int parcelas) {
        this.aluguel = aluguel;
        this.tipoOrigem = TipoOrigem.ALUGUEL;
        this.valorPago = valorPago;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.statusPagamento = StatusPagamento.PENDENTE;
    }

    public long getId() {
        return id;
    }

    public Venda getVenda() {
        return venda;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public TipoOrigem getTipoOrigem() {
        return tipoOrigem;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public TipoPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getTransacaoGateway() {
        return transacaoGateway;
    }

    public void setTransacaoGateway(String transacaoGateway) {
        this.transacaoGateway = transacaoGateway;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", tipoOrigem=" + tipoOrigem +
                ", valor=" + valorPago +
                ", status=" + statusPagamento +
                '}';
    }
}
