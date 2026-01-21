package br.com.mcgauto.domain.servico;

import br.com.mcgauto.domain.produto.Produto;
import br.com.mcgauto.domain.servico.enums.TipoOrdem;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = "item_ordem_de_servico")
public class ItemOrdemServico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ordem_servico_id", nullable = false)
    private OrdemServico ordemServico;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "produto_id")
    private Produto produto;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "servico_id")
    private Servico servico;

    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_ordem")
    private TipoOrdem tipoItem;

    private String descricao;

    @Column (nullable = false)
    private int quantidade;

    @Column (name = "preco_unitario", nullable = false)
    private BigDecimal precoUnitario;

    @Column(name = "valor_total", nullable = false)
    private BigDecimal valorTotal;

    public ItemOrdemServico (){
    }

    //Construtor para PRODUTO
    public ItemOrdemServico(OrdemServico ordemServico, Produto produto, int quantidade) {
        this.ordemServico = ordemServico;
        this.produto = produto;
        this.tipoItem = TipoOrdem.PECA;
        this.descricao = produto.getNome();
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPrecoVenda();
        this.valorTotal = this.precoUnitario.multiply(BigDecimal.valueOf(quantidade));
    }

    public ItemOrdemServico(OrdemServico ordemServico, Servico servico, int quantidade) {
        this.ordemServico = ordemServico;
        this.servico = servico;
        this.tipoItem = TipoOrdem.SERVICO;
        this.descricao = servico.getNome();
        this.quantidade = quantidade;
        this.precoUnitario = servico.getPreco();
        this.valorTotal = this.precoUnitario.multiply(BigDecimal.valueOf(quantidade));
    }

    public long getId() {
        return id;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }
    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public Produto getProduto() {
        return produto;
    }

    public Servico getServico() {
        return servico;
    }

    public TipoOrdem getTipoItem() {
        return tipoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        if (this.precoUnitario != null) {
            this.valorTotal = this.precoUnitario.multiply(BigDecimal.valueOf(quantidade));
        }
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "ItemOrdemServico{" +
                "id=" + id +
                ", tipo=" + tipoItem +
                ", desc='" + descricao + '\'' +
                ", qtd=" + quantidade +
                ", total=" + valorTotal +
                '}';
    }
}
