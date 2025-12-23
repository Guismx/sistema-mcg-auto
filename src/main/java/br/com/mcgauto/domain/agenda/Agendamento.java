package br.com.mcgauto.domain.agenda;

import br.com.mcgauto.domain.agenda.enums.StatusAgendamento;
import br.com.mcgauto.domain.servico.Servico;
import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.veiculo.VeiculoCliente;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

@Entity
@Table (name = "agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_agendamento", nullable = false)
    private long idAgendamento;
    private Usuario cliente;
    private Servico servico;
    private VeiculoCliente veiculoCliente;
    @FutureOrPresent
    private LocalDateTime dataHoraServico;
    @Column (nullable = false)
    @Positive
    private int estimativaDeTempo;
    @Enumerated(EnumType.STRING)
    private StatusAgendamento statusAgendamento;

    public Agendamento(){}

    public Agendamento(long idAgendamento, Usuario cliente, Servico servico, VeiculoCliente veiculoCliente,
                       LocalDateTime dataHoraServico, int estimativaDeTempo, StatusAgendamento statusAgendamento) {
        this.idAgendamento = idAgendamento;
        this.cliente = cliente;
        this.servico = servico;
        this.veiculoCliente = veiculoCliente;
        this.dataHoraServico = dataHoraServico;
        this.estimativaDeTempo = estimativaDeTempo;
        this.statusAgendamento = statusAgendamento;
    }

    public long getIdAgendamento() {
        return idAgendamento;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
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
        return "Agendamento{" +
                "idAgendamento=" + idAgendamento +
                ", cliente=" + cliente +
                ", servico=" + servico +
                ", veiculoCliente=" + veiculoCliente +
                ", dataHoraServico=" + dataHoraServico +
                ", estimativaDeTempo=" + estimativaDeTempo +
                ", statusAgendamento=" + statusAgendamento +
                '}';
    }
}
