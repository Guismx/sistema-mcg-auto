package br.com.mcgauto.domain.entities;


import br.com.mcgauto.domain.enums.movimentacaoEstoque.TipoMovimentacao;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "movimentacoes_estoque")
public class MovimentacaoEstoque {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idMovimentacao;
    private Produto produto;
    private Usuario responsavel;
    private TipoMovimentacao tipoMovimentacao;
    private int quantidade;
    private LocalDateTime DataHoraMovimentacao;
    private String motivo;
    private int saldoAnterior;
    private int saldoAtual;

    public MovimentacaoEstoque() {
    }

    public MovimentacaoEstoque(long idMovimentacao, Produto produto, Usuario responsavel, TipoMovimentacao tipoMovimentacao,
                               int quantidade, LocalDateTime dataHoraMovimentacao, String motivo, int saldoAnterior, int saldoAtual) {
        this.idMovimentacao = idMovimentacao;
        this.produto = produto;
        this.responsavel = responsavel;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        DataHoraMovimentacao = dataHoraMovimentacao;
        this.motivo = motivo;
        this.saldoAnterior = saldoAnterior;
        this.saldoAtual = saldoAtual;
    }

    public long getIdMovimentacao() {
        return idMovimentacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
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
        return DataHoraMovimentacao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(int saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public int getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    @Override
    public String toString() {
        return "MovimentacaoEstoque{" +
                "idMovimentacao=" + idMovimentacao +
                ", produto=" + produto +
                ", responsavel=" + responsavel +
                ", tipoMovimentacao=" + tipoMovimentacao +
                ", quantidade=" + quantidade +
                ", DataHoraMovimentacao=" + DataHoraMovimentacao +
                ", motivo='" + motivo + '\'' +
                ", saldoAnterior=" + saldoAnterior +
                ", saldoAtual=" + saldoAtual +
                '}';
    }
}
