package br.com.mcgauto.domain.produto;

import br.com.mcgauto.global.enums.StatusAtivacao;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "categoria_produto", nullable = false)
    private CategoriaProduto categoriaid;
    @Column (name = "codigo_produto", nullable = false)
    private int codigoProduto;
    private String nome;
    private String descricao;
    private String marca;
    @Column (name = "preco_custo")
    private BigDecimal precoCusto;
    @Column (name = "preco_venda")
    private BigDecimal precoVenda;
    @Column (name = "quantidade_estoque")
    private int qtdEstoque;
    @Enumerated (EnumType.STRING)
    @Column (name = "status_produto")
    private StatusAtivacao statusProduto;
    @Column (name = "criado_em", nullable = false, updatable = false)
    private LocalDateTime criadoEm;
    @Column (name = "atualizado_em")
    private LocalDateTime atualizadoEm;

    public Produto() {

    }

    public Produto(long id, CategoriaProduto categoriaid, int codigoProduto, String nome, String descricao, String marca,
                   BigDecimal precoCusto, BigDecimal precoVenda, int qtdEstoque, StatusAtivacao ativo,
                   LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.id = id;
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

    public long getId() {
        return id;
    }

    public CategoriaProduto getCategoriaid() {
        return categoriaid;
    }

    public void setCategoriaid(CategoriaProduto categoriaid) {
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
    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", categoriaid=" + (categoriaid != null ? categoriaid.getNome() : "sem categoria") +
                ", codigoProduto=" + codigoProduto +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                ", qtdEstoque=" + qtdEstoque +
                ", ativo=" + statusProduto +
                ", createdAt=" + criadoEm +
                ", updatedAt=" + atualizadoEm +
                '}';
    }
}
