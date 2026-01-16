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
    private String nome;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "modelo_id", nullable = false)
    private ModeloVeiculo modeloId;
    @Column (name = "ano_modelo", nullable = false)
    private int anoModelo;
    private String cor;
    private String placa;
    private String chassi;
    @Column (name = "tipo_modelo")
    private String tipoModelo;
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
    private LocalDateTime criadoEm;
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

    public Veiculo(long id, String nome, ModeloVeiculo modeloId, int anoModelo, String cor, String placa, String chassi, String tipoModelo,
                   int quilometragem, TipoCombustivel tipoCombustivel, BigDecimal precoCusto, BigDecimal precoVenda,
                   EstadoVeiculo estadoVeiculo, StatusVeiculo statusVeiculo, TipoPropriedade tipoPropriedade,
                   String descricaoDetalhada, LocalDateTime dataEntradaEstoque, LocalDateTime dataBaixaEstoque,
                   LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.id = id;
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
