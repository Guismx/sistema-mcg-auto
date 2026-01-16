package br.com.mcgauto.domain.servico;

import br.com.mcgauto.domain.produto.Produto;
import br.com.mcgauto.domain.servico.enums.TipoOrdem;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

@Entity
@Table (name = "item_ordem_de_servico")
public class ItemOrdemServico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn (name = "produto_id", nullable = false)
    private Produto produto;
    @OneToOne
    @JoinColumn (name = "servico_id", nullable = false)
    private Servico servico;
    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_ordem")
    private TipoOrdem tipoOrdem;
    private String descricao;
    private int quantidade;
    @Column (name = "preco_unitario", nullable = false)
    private BigDecimal precoUnitario;
    private BigDecimal valorTotal;

    public ItemOrdemServico (){

    }

    public ItemOrdemServico(long id, Produto produto, Servico servico, TipoOrdem tipoOrdem, String descricao, int quantidade, BigDecimal precoUnitario, BigDecimal valorTotal) {
        this.id = id;
        this.produto = produto;
        this.servico = servico;
        this.tipoOrdem = tipoOrdem;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.valorTotal = valorTotal;
    }

    public long getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public TipoOrdem getTipoOrdem() {
        return tipoOrdem;
    }

    public void setTipoOrdem(TipoOrdem tipoOrdem) {
        this.tipoOrdem = tipoOrdem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "ItemOrdemServico{" +
                "id=" + id +
                ", produto=" + (produto != null ? produto.getNome() : null) +
                ", servico=" + (servico != null ? servico.getNome() : null) +
                ", tipoItem=" + tipoOrdem +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", precoUnitario=" + precoUnitario +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
