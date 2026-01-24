package br.com.mcgauto.domain.veiculo;

import br.com.mcgauto.domain.veiculo.enums.EstadoVeiculo;
import br.com.mcgauto.domain.veiculo.enums.StatusVeiculo;
import br.com.mcgauto.domain.veiculo.enums.TipoCombustivel;
import br.com.mcgauto.domain.veiculo.enums.TipoPropriedade;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable = false)
    private String nome;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "modelo_id", nullable = false)
    private ModeloVeiculo modelo;

    @Column (name = "ano_modelo", nullable = false)
    private int anoModelo;

    @Column (nullable = false)
    private String cor;

    @Column (nullable = false, unique = true, length = 7)
    private String placa;

    @Column (nullable = false, unique = true, length = 17)
    private String chassi;

    @Column (name = "tipo_modelo")
    private String tipoModelo;

    @Column (nullable = false)
    private int quilometragem;

    @Column (name = "preco_custo", nullable = false)
    private BigDecimal precoCusto;

    @Column (name = "preco_venda", nullable = false)
    private BigDecimal precoVenda;

    @Column (name = "descricao_detalhada")
    private String descricaoDetalhada;

    @Column (name = "data_entrada_estoque", nullable = false)
    private LocalDateTime dataEntradaEstoque;

    @Column (name = "data_baixa_estoque")
    private LocalDateTime dataBaixaEstoque;

    @CreationTimestamp
    @Column (name = "criado_em", nullable = false, updatable = false)
    private LocalDateTime criadoEm;

    @UpdateTimestamp
    @Column (name = "autalizado_em", nullable = false)
    private LocalDateTime atualizadoEm;

    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_combustivel", nullable = false)
    private TipoCombustivel tipoCombustivel;

    @Enumerated (EnumType.STRING)
    @Column (name = "estado_veiculo", nullable = false)
    private EstadoVeiculo estadoVeiculo;

    @Enumerated (EnumType.STRING)
    @Column (name = "status_veiculo", nullable = false)
    private StatusVeiculo statusVeiculo;

    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_propriedade")
    private TipoPropriedade tipoPropriedade;

    public Veiculo() {}

    public Veiculo(ModeloVeiculo modelo, String nome, int anoModelo, String cor, String placa, String chassi,
                   int quilometragem, TipoCombustivel tipoCombustivel, BigDecimal precoCusto, BigDecimal precoVenda,
                   TipoPropriedade tipoPropriedade, EstadoVeiculo estadoVeiculo) {
        this.modelo = modelo;
        this.nome = nome;
        this.anoModelo = anoModelo;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
        this.quilometragem = quilometragem;
        this.tipoCombustivel = tipoCombustivel;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.tipoPropriedade = tipoPropriedade;
        this.estadoVeiculo = estadoVeiculo;
        this.statusVeiculo = StatusVeiculo.DISPONIVEL;
        this.dataEntradaEstoque = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public ModeloVeiculo getModelo() {
        return modelo;
    }

    public void setModelo(ModeloVeiculo modelo) {
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getTipoModelo() {
        return tipoModelo;
    }

    public void setTipoModelo(String tipoModelo) {
        this.tipoModelo = tipoModelo;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public TipoPropriedade getTipoPropriedade() {
        return tipoPropriedade;
    }

    public EstadoVeiculo getEstadoVeiculo() {
        return estadoVeiculo;
    }

    public StatusVeiculo getStatusVeiculo() {
        return statusVeiculo;
    }

    public void setStatusVeiculo(StatusVeiculo statusVeiculo) {
        this.statusVeiculo = statusVeiculo;
    }

    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }

    public LocalDateTime getDataEntradaEstoque() {
        return dataEntradaEstoque;
    }

    public LocalDateTime getDataBaixaEstoque() {
        return dataBaixaEstoque;
    }

    public void setDataBaixaEstoque(LocalDateTime dataBaixaEstoque) {
        this.dataBaixaEstoque = dataBaixaEstoque;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", modelo=" + (modelo != null ? modelo.getNome() : "null") +
                ", placa='" + placa + '\'' +
                ", status=" + statusVeiculo +
                '}';
    }

}
