package br.com.mcgauto.domain.produto;

import br.com.mcgauto.global.enums.StatusAtivacao;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idProduto;
    private int categoriaid;
    private int codigoProduto;
    private String nome;
    private String descricao;
    private String marca;
    private BigDecimal precoCusto;
    private BigDecimal precoVenda;
    private int qtdEstoque;
    private StatusAtivacao statusProduto;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public Produto() {}

    public Produto(long idProduto, int categoriaid, int codigoProduto, String nome, String descricao, String marca,
                   BigDecimal precoCusto, BigDecimal precoVenda, int qtdEstoque, StatusAtivacao ativo,
                   LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.idProduto = idProduto;
        this.categoriaid = categoriaid;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
        this.statusProduto = StatusAtivacao.ATIVO;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public int getCategoriaid() {
        return categoriaid;
    }

    public void setCategoriaid(int categoriaid) {
        this.categoriaid = categoriaid;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public StatusAtivacao getStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(StatusAtivacao statusProduto) {
        this.statusProduto = statusProduto;
    }
    public LocalDateTime getCreatedAt() {
        return criadoEm;
    }

    public LocalDateTime getUpdatedAt() {
        return atualizadoEm;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", categoriaid=" + categoriaid +
                ", codigoProduto=" + codigoProduto +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                ", qtdEstoque=" + qtdEstoque +
                ", ativo=" + ativo +
                ", createdAt=" + criadoEm +
                ", updatedAt=" + atualizadoEm +
                '}';
    }
}
