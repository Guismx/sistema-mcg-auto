package br.com.mcgauto.domain.agenda;

import br.com.mcgauto.domain.agenda.enums.StatusAluguel;
import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.veiculo.Veiculo;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
    @JoinColumn (name = "cliente_id", nullable = false)
    private Usuario cliente;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "veiculo_id", nullable = false)
    private Veiculo veiculo;

    @Column (name = "data_retirada_prevista", nullable = false)
    private LocalDate dataRetiradaPrevista;

    @Column (name = "data_devolucao_prevista", nullable = false)
    private LocalDate dataDevolucaoPrevista;

    @Column (name = "data_retirada")
    private LocalDate dataDaRetirada;

    @Column (name = "data_devolucao")
    private LocalDate dataDeDevolucao;

    @Column (name = "km_retirada", nullable = false)
    private int kmRetirada;

    @Column (name = "km_devolucao")
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
    private Usuario funcionarioConfirmacao;

    @Column (name = "observacoes_checkin")
    private String observacoesCheckin;

    @CreationTimestamp
    @Column(name = "criado_em", updatable = false)
    private LocalDateTime criadoEm;

    @UpdateTimestamp
    @Column(name = "atualizado_em")
    private LocalDateTime atualizadoEm;

    public Aluguel(){
    }

    public Aluguel(int numeroAluguel, Usuario cliente, Veiculo veiculo, LocalDate dataRetiradaPrevista,
                   LocalDate dataDevolucaoPrevista, BigDecimal valorDiaria, BigDecimal valorTotalPrevisto,
                   StatusAluguel statusAluguel) {
        this.numeroAluguel = numeroAluguel;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataRetiradaPrevista = dataRetiradaPrevista;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.valorDiaria = valorDiaria;
        this.valorTotalPrevisto = valorTotalPrevisto;
        this.statusAluguel = statusAluguel;
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

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataRetiradaPrevista() {
        return dataRetiradaPrevista;
    }

    public void setDataRetiradaPrevista(LocalDate dataRetiradaPrevista) {
        this.dataRetiradaPrevista = dataRetiradaPrevista;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
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

    public Usuario getFuncionarioConfirmacao() {
        return funcionarioConfirmacao;
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
                ", num=" + numeroAluguel +
                ", status=" + statusAluguel +
                ", cliente=" + (cliente != null ? cliente.getNome() : "null") +
                ", veiculo=" + (veiculo != null ? veiculo.getPlaca() : "null") +
                '}';
    }
}
