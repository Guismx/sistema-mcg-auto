package br.com.mcgauto.domain.estoque;


import br.com.mcgauto.domain.produto.Produto;
import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.estoque.enums.TipoMovimentacao;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table (name = "movimentacoes_estoque")
public class MovimentacaoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responsavel_id", nullable = false)
    private Usuario responsavel;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_movimentacao", nullable = false)
    private TipoMovimentacao tipoMovimentacao;

    @Column(nullable = false)
    private int quantidade;

    @CreationTimestamp
    @Column(name = "data_hora_movimentacao", nullable = false, updatable = false)
    private LocalDateTime dataHoraMovimentacao;

    private String motivo;

    @Column(name = "saldo_anterior", nullable = false)
    private int saldoAnterior;

    @Column(name = "saldo_atual", nullable = false)
    private int saldoAtual;

    public MovimentacaoEstoque() {
    }

    public MovimentacaoEstoque(long id, Produto produto, Usuario responsavel, TipoMovimentacao tipoMovimentacao,
                               int quantidade, LocalDateTime dataHoraMovimentacao, String motivo, int saldoAnterior, int saldoAtual) {
        this.id = id;
        this.produto = produto;
        this.responsavel = responsavel;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.dataHoraMovimentacao = dataHoraMovimentacao;
        this.motivo = motivo;
        this.saldoAnterior = saldoAnterior;
        this.saldoAtual = saldoAtual;
    }

    public long getIdMovimentacao() {
        return id;
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
        return dataHoraMovimentacao;
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
                "id=" + id +
                ", produto=" + (produto != null ? produto.getNome() : "null") +
                ", tipo=" + tipoMovimentacao +
                ", qtd=" + quantidade +
                ", data=" + dataHoraMovimentacao +
                '}';
    }
}
