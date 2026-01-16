package br.com.mcgauto.domain.agenda;

import br.com.mcgauto.domain.agenda.enums.StatusAluguel;
import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.veiculo.Veiculo;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table (name = "alugueis")
public class Aluguel {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @Column (name = "numero_aluguel", nullable = false)
    private int numeroAluguel;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "usuario_id", nullable = false)
    private Usuario clienteId;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "veiculo_id", nullable = false)
    private Veiculo veiculoId;
    @Column (name = "data_retirada_prevista")
    private LocalDate dataRetiradaPrevista;
    @Column (name = "data_devolucao_prevista")
    private LocalDate dateDevolucaoPrevista;
    @Column (name = "data_retirada")
    private LocalDate dataDaRetirada;
    @Column (name = "data_devolucao")
    private LocalDate dataDeDevolucao;
    private int kmRetirada;
    private int kmDevolucao;
    @Column (name = "valor_diaria", nullable = false)
    private BigDecimal valorDiaria;
    @Column (name = "valor_caucao")
    private BigDecimal valorCaucao;
    @Column (name = "valor_total_previsto", nullable = false)
    private BigDecimal valorTotalPrevisto;
    @Column (name = "valor_adicional_avarias")
    private BigDecimal valorAdicionalAvarias;
    @Column (name = "valor_adicional_km_excedentes")
    private BigDecimal valorAdicionalKmExcedentes;
    @Enumerated (EnumType.STRING)
    @Column (name = "status_aluguel")
    private StatusAluguel statusAluguel;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "funcionario_aprovou")
    private Usuario funcionarioDeConfirmacao;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "funcionario_checkin")
    private Usuario funcionarioDeCheckin;
    @Column (name = "observacoes_checkin")
    private String observacoesCheckin;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public Aluguel(){
    }

    public Aluguel(long id, int numeroAluguel, Usuario clienteId, Veiculo veiculoId, LocalDate dataRetiradaPrevista,
                   LocalDate dateDevolucaoPrevista, LocalDate dataDaRetirada, LocalDate dataDeDevolucao, int kmRetirada,
                   int kmDevolucao, BigDecimal valorDiaria, BigDecimal valorCaucao, BigDecimal valorTotalPrevisto, BigDecimal valorAdicionalAvarias,
                   BigDecimal valorAdicionalKmExcedentes, StatusAluguel statusAluguel, Usuario funcionarioDeConfirmacao, Usuario funcionarioDeCheckin,
                   String observacoesCheckin, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.id = id;
        this.numeroAluguel = numeroAluguel;
        this.clienteId = clienteId;
        this.veiculoId = veiculoId;
        this.dataRetiradaPrevista = dataRetiradaPrevista;
        this.dateDevolucaoPrevista = dateDevolucaoPrevista;
        this.dataDaRetirada = dataDaRetirada;
        this.dataDeDevolucao = dataDeDevolucao;
        this.kmRetirada = kmRetirada;
        this.kmDevolucao = kmDevolucao;
        this.valorDiaria = valorDiaria;
        this.valorCaucao = valorCaucao;
        this.valorTotalPrevisto = valorTotalPrevisto;
        this.valorAdicionalAvarias = valorAdicionalAvarias;
        this.valorAdicionalKmExcedentes = valorAdicionalKmExcedentes;
        this.statusAluguel = statusAluguel;
        this.funcionarioDeConfirmacao = funcionarioDeConfirmacao;
        this.funcionarioDeCheckin = funcionarioDeCheckin;
        this.observacoesCheckin = observacoesCheckin;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
    }

    public long getIdAluguel() {
        return id;
    }

    public int getNumeroAluguel() {
        return numeroAluguel;
    }

    public void setNumeroAluguel(int numeroAluguel) {
        this.numeroAluguel = numeroAluguel;
    }

    public Usuario getClienteId() {
        return clienteId;
    }

    public void setClienteId(Usuario clienteId) {
        this.clienteId = clienteId;
    }

    public Veiculo getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Veiculo veiculoId) {
        this.veiculoId = veiculoId;
    }

    public LocalDate getDataRetiradaPrevista() {
        return dataRetiradaPrevista;
    }

    public void setDataRetiradaPrevista(LocalDate dataRetiradaPrevista) {
        this.dataRetiradaPrevista = dataRetiradaPrevista;
    }

    public LocalDate getDateDevolucaoPrevista() {
        return dateDevolucaoPrevista;
    }

    public void setDateDevolucaoPrevista(LocalDate dateDevolucaoPrevista) {
        this.dateDevolucaoPrevista = dateDevolucaoPrevista;
    }

    public LocalDate getDataDaRetirada() {
        return dataDaRetirada;
    }

    public void setDataDaRetirada(LocalDate dataDaRetirada) {
        this.dataDaRetirada = dataDaRetirada;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(LocalDate dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public int getKmRetirada() {
        return kmRetirada;
    }

    public int getKmDevolucao() {
        return kmDevolucao;
    }

    public void setKmDevolucao(int kmDevolucao) {
        this.kmDevolucao = kmDevolucao;
    }

    public BigDecimal getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(BigDecimal valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public BigDecimal getValorCaucao() {
        return valorCaucao;
    }

    public void setValorCaucao(BigDecimal valorCaucao) {
        this.valorCaucao = valorCaucao;
    }

    public BigDecimal getValorTotalPrevisto() {
        return valorTotalPrevisto;
    }

    public void setValorTotalPrevisto(BigDecimal valorTotalPrevisto) {
        this.valorTotalPrevisto = valorTotalPrevisto;
    }

    public BigDecimal getValorAdicionalAvarias() {
        return valorAdicionalAvarias;
    }

    public void setValorAdicionalAvarias(BigDecimal valorAdicionalAvarias) {
        this.valorAdicionalAvarias = valorAdicionalAvarias;
    }

    public BigDecimal getValorAdicionalKmExcedentes() {
        return valorAdicionalKmExcedentes;
    }

    public void setValorAdicionalKmExcedentes(BigDecimal valorAdicionalKmExcedentes) {
        this.valorAdicionalKmExcedentes = valorAdicionalKmExcedentes;
    }

    public StatusAluguel getStatusAluguel() {
        return statusAluguel;
    }

    public void setStatusAluguel(StatusAluguel statusAluguel) {
        this.statusAluguel = statusAluguel;
    }

    public Usuario getFuncionarioDeConfirmacao() {
        return funcionarioDeConfirmacao;
    }

    public Usuario getFuncionarioDeCheckin() {
        return funcionarioDeCheckin;
    }

    public String getObservacoesCheckin() {
        return observacoesCheckin;
    }

    public void setObservacoesCheckin(String observacoesCheckin) {
        this.observacoesCheckin = observacoesCheckin;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "id=" + id +
                ", numeroAluguel=" + numeroAluguel +
                ", clienteId=" + (clienteId != null ? clienteId.getNome() : null) +
                ", veiculoId=" + (veiculoId != null ? veiculoId.getId() : null) +
                ", dataRetiradaPrevista=" + dataRetiradaPrevista +
                ", dateDevolucaoPrevista=" + dateDevolucaoPrevista +
                ", dataDaRetirada=" + dataDaRetirada +
                ", dataDeDevolucao=" + dataDeDevolucao +
                ", kmRetirada=" + kmRetirada +
                ", kmDevolucao=" + kmDevolucao +
                ", valorDiaria=" + valorDiaria +
                ", valorCaucao=" + valorCaucao +
                ", valorTotalPrevisto=" + valorTotalPrevisto +
                ", valorAdicionalAvarias=" + valorAdicionalAvarias +
                ", valorAdicionalKmExcedentes=" + valorAdicionalKmExcedentes +
                ", statusAluguel=" + statusAluguel +
                ", funcionarioDeConfirmacao=" + (funcionarioDeConfirmacao != null ? funcionarioDeConfirmacao.getNome() : null) +
                ", funcionarioDeCheckin=" + (funcionarioDeCheckin != null ? funcionarioDeCheckin.getNome() : null) +
                ", observacoesCheckin='" + observacoesCheckin + '\'' +
                ", criadoEm=" + criadoEm +
                ", atualizadoEm=" + atualizadoEm +
                '}';
    }
}
