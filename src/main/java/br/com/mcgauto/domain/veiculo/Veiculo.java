package br.com.mcgauto.domain.veiculo;

import br.com.mcgauto.domain.veiculo.enums.EstadoVeiculo;
import br.com.mcgauto.domain.veiculo.enums.StatusVeiculo;
import br.com.mcgauto.domain.veiculo.enums.TipoCombustivel;
import br.com.mcgauto.domain.veiculo.enums.TipoPropriedade;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "modelo_id", nullable = false)
    private ModeloVeiculo modeloId;

    @NotNull (message = "O ano do veículo deve ser informado")
    @Positive
    private int anoModelo;

    @NotBlank (message = "A cor deve ser informada")
    @Size (min = 3, max = 20)
    private String cor;

    @Min(7)
    @NotBlank (message = "O número da placa deve ser informado")
    @Column (length = 7, nullable = false, unique = true)
    private String placa;

    @NotBlank (message = "O chassi deve ser informado")
    private String chassi;
    private String tipoModelo;

    @NotNull (message = "A quilometragem deve ser informada")
    @PositiveOrZero
    private int quilometragem;

    @NotNull (message = "O tipo de combustivel deve ser informado")
    @Enumerated (EnumType.STRING)
    private TipoCombustivel tipoCombustivel;

    @NotNull
    private BigDecimal precoCusto;

    @NotNull
    private BigDecimal precoVenda;

    @NotNull (message = "O estado do veículo deve ser informado")
    @Enumerated (EnumType.STRING)
    private EstadoVeiculo estadoVeiculo;

    @NotNull (message = "O status do veículo deve ser informado")
    @Enumerated (EnumType.STRING)
    private StatusVeiculo statusVeiculo;

    @NotNull (message = "O tipo de propriedade deve ser informado")
    @Enumerated (EnumType.STRING)
    private TipoPropriedade tipoPropriedade;
    private String descricaoDetalhada;

    @NotNull
    private LocalDateTime dataEntradaEstoque;

    @NotNull
    private LocalDateTime dataBaixaEstoque;

    @NotNull
    private LocalDateTime criadoEm;

    @NotNull
    private LocalDateTime atualizadoEm;

    public Veiculo() {}

    public Veiculo(long id, ModeloVeiculo modeloId, int anoModelo, String cor, String placa, String chassi, String tipoModelo,
                   int quilometragem, TipoCombustivel tipoCombustivel, BigDecimal precoCusto, BigDecimal precoVenda,
                   EstadoVeiculo estadoVeiculo, StatusVeiculo statusVeiculo, TipoPropriedade tipoPropriedade,
                   String descricaoDetalhada, LocalDateTime dataEntradaEstoque, LocalDateTime dataBaixaEstoque,
                   LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.id = id;
        this.modeloId = modeloId;
        this.anoModelo = anoModelo;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
        this.tipoModelo = tipoModelo;
        this.quilometragem = quilometragem;
        this.tipoCombustivel = tipoCombustivel;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.estadoVeiculo = estadoVeiculo;
        this.statusVeiculo = statusVeiculo;
        this.tipoPropriedade = tipoPropriedade;
        this.descricaoDetalhada = descricaoDetalhada;
        this.dataEntradaEstoque = dataEntradaEstoque;
        this.dataBaixaEstoque = dataBaixaEstoque;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
    }

    public long getId() {
        return id;
    }

    public ModeloVeiculo getModeloId() {
        return modeloId;
    }

    public void setModeloId(ModeloVeiculo modeloId) {
        this.modeloId = modeloId;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
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

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
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

    public EstadoVeiculo getEstadoVeiculo() {
        return estadoVeiculo;
    }

    public void setEstadoVeiculo(EstadoVeiculo estadoVeiculo) {
        this.estadoVeiculo = estadoVeiculo;
    }

    public StatusVeiculo getStatusVeiculo() {
        return statusVeiculo;
    }

    public void setStatusVeiculo(StatusVeiculo statusVeiculo) {
        this.statusVeiculo = statusVeiculo;
    }

    public TipoPropriedade getTipoPropriedade() {
        return tipoPropriedade;
    }

    public void setTipoPropriedade(TipoPropriedade tipoPropriedade) {
        this.tipoPropriedade = tipoPropriedade;
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

    public void setDataEntradaEstoque(LocalDateTime dataEntradaEstoque) {
        this.dataEntradaEstoque = dataEntradaEstoque;
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

    public void setAtualizadoEm(LocalDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", anoModelo=" + anoModelo +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", chassi='" + chassi + '\'' +
                ", tipoModelo='" + tipoModelo + '\'' +
                ", quilometragem=" + quilometragem +
                ", tipoCombustivel=" + tipoCombustivel +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                ", estadoVeiculo=" + estadoVeiculo +
                ", statusVeiculo=" + statusVeiculo +
                ", tipoPropriedade=" + tipoPropriedade +
                ", dataEntradaEstoque=" + dataEntradaEstoque +
                ", dataBaixaEstoque=" + dataBaixaEstoque +
                ", criadoEm=" + criadoEm +
                ", atualizadoEm=" + atualizadoEm +
                '}';
    }

}
