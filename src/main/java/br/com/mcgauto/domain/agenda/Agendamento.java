package br.com.mcgauto.domain.agenda;

import br.com.mcgauto.domain.agenda.enums.StatusAgendamento;
import br.com.mcgauto.domain.servico.Servico;
import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.veiculo.VeiculoCliente;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

@Entity
@Table (name = "agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_agendamento", nullable = false)
    private Long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "cliente_id", nullable = false)
    private Usuario cliente;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "servico_id", nullable = false)
    private Servico servico;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "veiculo_cliente_id", nullable = false)
    private VeiculoCliente veiculoCliente;

    @FutureOrPresent
    @Column (name = "data_hora_servico")
    private LocalDateTime dataHoraServico;

    @Positive
    @Column (name = "estimativa_tempo",nullable = false)
    private int estimativaDeTempo;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column (name = "status_agendamento", nullable = false)
    private StatusAgendamento statusAgendamento;

    public Agendamento(){}

    public Agendamento(long id, Usuario cliente, Servico servico, VeiculoCliente veiculoCliente,
                       LocalDateTime dataHoraServico, int estimativaDeTempo, StatusAgendamento statusAgendamento) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.veiculoCliente = veiculoCliente;
        this.dataHoraServico = dataHoraServico;
        this.estimativaDeTempo = estimativaDeTempo;
        this.statusAgendamento = statusAgendamento;
    }

    public long getIdAgendamento() {
        return id;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario clienteId) {
        this.cliente = cliente;
    }

    public Servico getServicoId() {
        return servico;
    }

    public void setServico(Servico servicoId) {
        this.servico = servicoId;
    }

    public VeiculoCliente getVeiculoCliente() {
        return veiculoCliente;
    }

    public void setVeiculoCliente(VeiculoCliente veiculoCliente) {
        this.veiculoCliente = veiculoCliente;
    }

    public LocalDateTime getDataHoraServico() {
        return dataHoraServico;
    }

    public void setDataHoraServico(LocalDateTime dataHoraServico) {
        this.dataHoraServico = dataHoraServico;
    }

    public int getEstimativaDeTempo() {
        return estimativaDeTempo;
    }

    public void setEstimativaDeTempo(int estimativaDeTempo) {
        this.estimativaDeTempo = estimativaDeTempo;
    }

    public StatusAgendamento getStatusAgendamento() {
        return statusAgendamento;
    }

    public void setStatusAgendamento(StatusAgendamento statusAgendamento) {
        this.statusAgendamento = statusAgendamento;
    }

    @Override
    public String toString() {
        return "Agendamento[" +
                "id=" + id +
                ", data=" + dataHoraServico +
                ", status=" + statusAgendamento +
                ", cliente=" + (cliente != null ? cliente.getNome() : null) +
                ", servicoId=" + (servico != null ? servico.getId() : null) +
                "]";
    }
}
