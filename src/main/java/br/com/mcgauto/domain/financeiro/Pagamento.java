package br.com.mcgauto.domain.financeiro;

import br.com.mcgauto.domain.financeiro.enums.StatusPagamento;
import br.com.mcgauto.domain.financeiro.enums.TipoOrigem;
import br.com.mcgauto.domain.financeiro.enums.TipoPagamento;
import br.com.mcgauto.domain.venda.Venda;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "pagamentos")
public class Pagamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "venda_id", nullable = false)
    private Venda origem;
    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_origem")
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

    public Pagamento(long id, Venda origem, TipoOrigem tipoOrigem, LocalDateTime dataPagamento, BigDecimal valorPago,
                     TipoPagamento formaPagamento, StatusPagamento statusPagamento, String transacaoGateway, int parcelas) {
        this.id = id;
        this.origem = origem;
        this.tipoOrigem = tipoOrigem;
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
        this.transacaoGateway = transacaoGateway;
        this.parcelas = parcelas;
    }

    public long getId() {
        return id;
    }

    public Venda getOrigem() {
        return origem;
    }

    public void setOrigem(Venda origem) {
        this.origem = origem;
    }

    public TipoOrigem getTipoOrigem() {
        return tipoOrigem;
    }

    public void setTipoOrigem(TipoOrigem tipoOrigem) {
        this.tipoOrigem = tipoOrigem;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public TipoPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(TipoPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
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
                ", origem=" + (origem != null ? origem.getId() : null) +
                ", tipoOrigem=" + tipoOrigem +
                ", dataPagamento=" + dataPagamento +
                ", valorPago=" + valorPago +
                ", formaPagamento=" + formaPagamento +
                ", statusPagamento=" + statusPagamento +
                ", transacaoGateway='" + transacaoGateway + '\'' +
                ", parcelas=" + parcelas +
                '}';
    }
}
