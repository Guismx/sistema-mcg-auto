package br.com.mcgauto.domain.financeiro;

import br.com.mcgauto.domain.venda.Venda;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "pagamentos")
public class Pagamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idPagamento;
    private Venda origem;
    private TipoOrigem tipoOrigem;
    private LocalDateTime dataPagamento;
    private BigDecimal valorPago;
    private TipoPagamento formaPagamento;
    private StatusPagamento statusPagamento;
    private String transacaoGateway;
    private int parcelas;

    public Pagamento() {}

    public Pagamento(long idPagamento, Venda origem, TipoOrigem tipoOrigem, LocalDateTime dataPagamento, BigDecimal valorPago,
                     TipoPagamento formaPagamento, StatusPagamento statusPagamento, String transacaoGateway, int parcelas) {
        this.idPagamento = idPagamento;
        this.origem = origem;
        this.tipoOrigem = tipoOrigem;
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
        this.transacaoGateway = transacaoGateway;
        this.parcelas = parcelas;
    }

    public long getIdPagamento() {
        return idPagamento;
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
                "idPagamento=" + idPagamento +
                ", origem=" + origem +
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
