package br.com.mcgauto.domain.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "movimentacoes_estoque")
public class MovimentacaoEstoque {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idMovimentacao;
    private Produto produtoId;
    private Usuario usuarioResponsavel;
    private TipoMovimentacao tipoMovimentacao;
    private int quantidade;
    private LocalDateTime dataHoraMovimentacao;
    private String motivo;
    private BigDecimal saldoAnterior;
    private BigDecimal saldoAtual;

    public MovimentacaoEstoque() {
    }

    public MovimentacaoEstoque(long idMovimentacao, Produto produtoId, Usuario usuarioResponsavel, TipoMovimentacao tipoMovimentacao,
                               int quantidade, LocalDateTime dataHoraMovimentacao, String motivo, BigDecimal saldoAnterior, BigDecimal saldoAtual) {
        this.idMovimentacao = idMovimentacao;
        this.produtoId = produtoId;
        this.usuarioResponsavel = usuarioResponsavel;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.dataHoraMovimentacao = dataHoraMovimentacao;
        this.motivo = motivo;
        this.saldoAnterior = saldoAnterior;
        this.saldoAtual = saldoAtual;
    }

    public long getIdMovimentacao() {
        return idMovimentacao;
    }

    public Produto getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Produto produtoId) {
        this.produtoId = produtoId;
    }

    public Usuario getUsuarioResponsavel() {
        return usuarioResponsavel;
    }

    public void setUsuarioResponsavel(Usuario usuarioResponsavel) {
        this.usuarioResponsavel = usuarioResponsavel;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getDataHoraMovimentacao() {
        return dataHoraMovimentacao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public BigDecimal getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(BigDecimal saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public BigDecimal getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(BigDecimal saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    @Override
    public String toString() {
        return "MovimentacaoEstoque{" +
                "idMovimentacao=" + idMovimentacao +
                ", produtoId=" + produtoId +
                ", usuarioResponsavel=" + usuarioResponsavel +
                ", tipoMovimentacao=" + tipoMovimentacao +
                ", quantidade=" + quantidade +
                ", dataHoraMovimentacao=" + dataHoraMovimentacao +
                ", motivo='" + motivo + '\'' +
                ", saldoAnterior=" + saldoAnterior +
                ", saldoAtual=" + saldoAtual +
                '}';
    }
}

