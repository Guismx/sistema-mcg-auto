package br.com.mcgauto.domain.venda;

import br.com.mcgauto.domain.produto.Produto;
import br.com.mcgauto.domain.veiculo.Veiculo;
import br.com.mcgauto.domain.venda.enums.VendaItem;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table (name = "item_venda")
public class ItemVenda {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idItem;
    private VendaItem tipoItem;
    private Produto produto;
    private Veiculo veiculo;
    private int quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal precoVenda;
    private BigDecimal valorDesconto;
    private BigDecimal valorTotal;

    public ItemVenda(){}

    public ItemVenda(long idItem, VendaItem tipoItem, Produto produto, Veiculo veiculo, int quantidade,
                     BigDecimal precoUnitario, BigDecimal precoVenda, BigDecimal valorDesconto, BigDecimal valorTotal) {
        this.idItem = idItem;
        this.tipoItem = tipoItem;
        this.produto = produto;
        this.veiculo = veiculo;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.precoVenda = precoVenda;
        this.valorDesconto = valorDesconto;
        this.valorTotal = valorTotal;
    }

    public long getIdItem() {
        return idItem;
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
                "idItem=" + idItem +
                ", tipoItem=" + tipoItem +
                ", produto=" + produto +
                ", veiculo=" + veiculo +
                ", quantidade=" + quantidade +
                ", precoUnitario=" + precoUnitario +
                ", precoVenda=" + precoVenda +
                ", valorDesconto=" + valorDesconto +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
