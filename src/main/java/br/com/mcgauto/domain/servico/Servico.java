package br.com.mcgauto.domain.servico;

import br.com.mcgauto.domain.produto.CategoriaProduto;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "servicos")
public class Servico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idServico;
    private CategoriaProduto categoriaProduto;
    private int codigoProduto;
    private String nome;
    private String descricao;
    private String marca;
    private BigDecimal precoCusto;
    private BigDecimal precoVenda;
    private int qtdEstoque;
    private StatusProduto isAtivo;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public Servico() {
    }

    public Servico(long idServico, CategoriaProduto categoriaProduto, int codigoProduto, String nome, String descricao, String marca, BigDecimal precoCusto,
                   BigDecimal precoVenda, int qtdEstoque, StatusProduto isAtivo, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.idServico = idServico;
        this.categoriaProduto = categoriaProduto;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
        this.isAtivo = isAtivo;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
    }

    public long getIdServico() {
        return idServico;
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
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

    public StatusProduto getIsAtivo() {
        return isAtivo;
    }

    public void setIsAtivo(StatusProduto isAtivo) {
        this.isAtivo = isAtivo;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "idServico=" + idServico +
                ", categoriaProduto=" + categoriaProduto +
                ", codigoProduto=" + codigoProduto +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                ", qtdEstoque=" + qtdEstoque +
                ", isAtivo=" + isAtivo +
                ", criadoEm=" + criadoEm +
                ", atualizadoEm=" + atualizadoEm +
                '}';
    }
}
