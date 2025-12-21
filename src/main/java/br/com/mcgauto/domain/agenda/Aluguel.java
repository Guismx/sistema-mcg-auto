package br.com.mcgauto.domain.agenda;

import br.com.mcgauto.domain.agenda.enums.StatusAluguel;
import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.veiculo.Veiculo;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table (name = "alugueis")
public class Aluguel {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idAluguel;
    private int numeroAluguel;
    private Usuario clienteId;
    private Veiculo veiculoId;
    private LocalDate dataRetiradaPrevista;
    private LocalDate dateDevolucaoPrevista;
    private LocalDate dataDaRetirada;
    private LocalDate dataDeDevolucao;
    private int kmRetirada;
    private int kmDevolucao;
    private BigDecimal valorDiaria;
    private BigDecimal valorCaucao;
    private BigDecimal valorTotalPrevisto;
    private BigDecimal valorAdicionalAvarias;
    private BigDecimal valorAdicionalKmExcedentes;
    private StatusAluguel statusAluguel;
    private Usuario funcionarioDeConfirmacao;
    private Usuario funcionarioDeCheckin;
    private String observacoesCheckin;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public Aluguel(){
    }

    public Aluguel(long idAluguel, int numeroAluguel, Usuario clienteId, Veiculo veiculoId, LocalDate dataRetiradaPrevista,
                   LocalDate dateDevolucaoPrevista, LocalDate dataDaRetirada, LocalDate dataDeDevolucao, int kmRetirada,
                   int kmDevolucao, BigDecimal valorDiaria, BigDecimal valorCaucao, BigDecimal valorTotalPrevisto, BigDecimal valorAdicionalAvarias,
                   BigDecimal valorAdicionalKmExcedentes, StatusAluguel statusAluguel, Usuario funcionarioDeConfirmacao, Usuario funcionarioDeCheckin,
                   String observacoesCheckin, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.idAluguel = idAluguel;
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
        return idAluguel;
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
                "idAluguel=" + idAluguel +
                ", numeroAluguel=" + numeroAluguel +
                ", clienteId=" + clienteId +
                ", veiculoId=" + veiculoId +
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
                ", funcionarioDeConfirmacao=" + funcionarioDeConfirmacao +
                ", funcionarioDeCheckin=" + funcionarioDeCheckin +
                ", observacoesCheckin='" + observacoesCheckin + '\'' +
                ", criadoEm=" + criadoEm +
                ", atualizadoEm=" + atualizadoEm +
                '}';
    }
}
