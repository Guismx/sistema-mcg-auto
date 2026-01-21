package br.com.mcgauto.domain.servico;

import br.com.mcgauto.domain.agenda.Agendamento;
import br.com.mcgauto.domain.usuario.Usuario;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "ordens_servico")
public class OrdemServico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "numero_ordem", nullable = false, unique = true)
    private int numeroOrdem;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agendamento_id")
    private Agendamento agendamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Usuario cliente;

    @OneToMany(mappedBy = "ordemServico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemOrdemServico> itens = new ArrayList<>();

    private String descricao;

    @Column (name = "valor_servico", nullable = false)
    private BigDecimal valorServico;

    @Column(nullable = false)
    private String status; //Aberta, Andamento, Concluida...

    @CreationTimestamp
    @Column(name = "data_abertura", nullable = false, updatable = false)
    private LocalDateTime dataAbertura;

    @Column(name = "data_fechamento")
    private LocalDateTime dataFechamento;

    @UpdateTimestamp
    @Column(name = "atualizado_em")
    private LocalDateTime atualizadoEm;

    public OrdemServico () {}

    public OrdemServico(int numeroOrdem, Usuario cliente, String descricao) {
        this.numeroOrdem = numeroOrdem;
        this.cliente = cliente;
        this.descricao = descricao;
        this.status = "ABERTA";
        this.valorServico = BigDecimal.ZERO;
    }

    public void adicionarItem(ItemOrdemServico item) {
        this.itens.add(item);
        item.setOrdemServico(this);
    }

    public void removerItem(ItemOrdemServico item) {
        this.itens.remove(item);
        item.setOrdemServico(null);
    }

    public long getId() {
        return id;
    }

    public int getNumeroOrdem() {
        return numeroOrdem;
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

    public List<ItemOrdemServico> getItens() {
        return itens;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorTotal() {
        return valorServico;
    }
    public void setValorTotal(BigDecimal valorServico) {
        this.valorServico = valorServico;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
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

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }


    @Override
    public String toString() {
        return "OrdemServico{" +
                "id=" + id +
                ", numero=" + numeroOrdem +
                ", cliente=" + (cliente != null ? cliente.getNome() : "null") +
                ", status='" + status + '\'' +
                ", total=" + valorServico +
                '}';
    }
}
