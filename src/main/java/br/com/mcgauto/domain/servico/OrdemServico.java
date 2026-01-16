package br.com.mcgauto.domain.servico;


import br.com.mcgauto.domain.agenda.Agendamento;
import br.com.mcgauto.domain.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "ordem_de_servicos")
public class OrdemServico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "numero_ordem", nullable = false)
    private int numeroOrdem;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agendamento_id")
    private Agendamento agendamento;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Usuario cliente;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_servico_id", nullable = false)
    private ItemOrdemServico itemOrdemServico;
    @Column(name = "data_abertura", nullable = false, updatable = false)
    private LocalDateTime dataAbertura;
    @Column(name = "data_fechamento")
    private LocalDateTime dataFechamento;
    private String descricao;
    @Column (name = "valor_servico", nullable = false)
    private BigDecimal valorServico;
    private String status; //Aberta, Andamento, Concluida...

    public OrdemServico () {}

    public OrdemServico(long id, Agendamento agendamento, Usuario cliente, int numeroOrdem, ItemOrdemServico itemOrdemServico, LocalDateTime dataAbertura, LocalDateTime dataFechamento, String descricao, BigDecimal valorServico, String status) {
        this.id = id;
        this.agendamento = agendamento;
        this.cliente = cliente;
        this.numeroOrdem = numeroOrdem;
        this.itemOrdemServico = itemOrdemServico;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.descricao = descricao;
        this.valorServico = valorServico;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public int getNumeroOrdem() {
        return numeroOrdem;
    }

    public ItemOrdemServico getItemOrdemServico() {
        return itemOrdemServico;
    }

    public void setItemOrdemServico(ItemOrdemServico itemOrdemServico) {
        this.itemOrdemServico = itemOrdemServico;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDateTime dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorServico() {
        return valorServico;
    }

    public void setValorServico(BigDecimal valorServico) {
        this.valorServico = valorServico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrdemServico{" +
                "id=" + id +
                ", agendamento=" + agendamento +
                ", cliente=" + cliente +
                ", numeroOrdem=" + numeroOrdem +
                ", itemOrdemServico=" + itemOrdemServico +
                ", dataAbertura=" + dataAbertura +
                ", dataFechamento=" + dataFechamento +
                ", descricao='" + descricao + '\'' +
                ", valorServico=" + valorServico +
                ", status='" + status + '\'' +
                '}';
    }
}
