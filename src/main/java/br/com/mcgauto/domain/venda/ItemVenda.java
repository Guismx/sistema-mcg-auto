package br.com.mcgauto.domain.venda;

import br.com.mcgauto.domain.produto.Produto;
import br.com.mcgauto.domain.veiculo.Veiculo;
import br.com.mcgauto.domain.venda.enums.VendaItem;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

@Entity
@Table (name = "item_venda")
public class ItemVenda {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_item", nullable = false)
    private VendaItem tipoItem;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "produto_id")
    private Produto produto;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "veiculo_id")
    private Veiculo veiculo;
    private int quantidade;
    @Column (name = "preco_unitario")
    private BigDecimal precoUnitario;
    @Column (name = "preco_venda")
    private BigDecimal precoVenda;
    @Column (name = "valor_desconto")
    private BigDecimal valorDesconto;
    @Column (name = "valor_total", nullable = false)
    private BigDecimal valorTotal;

    public ItemVenda(){}

    public ItemVenda(long id, VendaItem tipoItem, Produto produto, Veiculo veiculo, int quantidade,
                     BigDecimal precoUnitario, BigDecimal precoVenda, BigDecimal valorDesconto, BigDecimal valorTotal) {
        this.id = id;
        this.tipoItem = tipoItem;
        this.produto = produto;
        this.veiculo = veiculo;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.precoVenda = precoVenda;
        this.valorDesconto = valorDesconto;
        this.valorTotal = valorTotal;
    }

    public long getId() {
        return id;
    }

    public VendaItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(VendaItem tipoItem) {
        this.tipoItem = tipoItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
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

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "id=" + id +
                ", tipoItem=" + tipoItem +
                ", produto=" + (produto != null ? produto.getNome() : null) +
                ", veiculo=" + (veiculo != null ? veiculo.getNome() : null) +
                ", quantidade=" + quantidade +
                ", precoUnitario=" + precoUnitario +
                ", precoVenda=" + precoVenda +
                ", valorDesconto=" + valorDesconto +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
