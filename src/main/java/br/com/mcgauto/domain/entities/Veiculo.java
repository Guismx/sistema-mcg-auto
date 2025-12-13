package br.com.mcgauto.domain.entities;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idVeiculo;
    private int modeloId;
    private int anoModelo;
    private String cor;
    private String placa;
    private String chassi;
    private String tipoModelo;
    private int quilometragem;
    //private TipoCombustivel tipoCombustivel;
    private BigDecimal precoCusto;
    private BigDecimal precoVenda;
    //private EstadoVeiculo estadoVeiculo;
    //private StatusVeiculo statusVeiculo;
    //private TipoPropriedade tipoPropriedade;
    private String descricaoDetalhada;
    private LocalDateTime dataEntradaEstoque;
    private LocalDateTime dataBaixaEstoque;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;


    public Veiculo() {
    }

    public Veiculo(long idVeiculo, int modeloId, int anoModelo, String cor, String placa, String chassi, String tipoModelo, int quilometragem, BigDecimal precoCusto, BigDecimal precoVenda, String descricaoDetalhada, LocalDateTime dataEntradaEstoque, LocalDateTime dataBaixaEstoque, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.idVeiculo = idVeiculo;
        this.modeloId = modeloId;
        this.anoModelo = anoModelo;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
        this.tipoModelo = tipoModelo;
        this.quilometragem = quilometragem;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.descricaoDetalhada = descricaoDetalhada;
        this.dataEntradaEstoque = dataEntradaEstoque;
        this.dataBaixaEstoque = dataBaixaEstoque;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
    }

    public long getIdVeiculo() {
        return idVeiculo;
    }

    public int getModeloId() {
        return modeloId;
    }

    public void setModeloId(int modeloId) {
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

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "idVeiculo=" + idVeiculo +
                ", modeloId=" + modeloId +
                ", anoModelo=" + anoModelo +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", chassi='" + chassi + '\'' +
                ", tipoModelo='" + tipoModelo + '\'' +
                ", quilometragem=" + quilometragem +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                ", descricaoDetalhada='" + descricaoDetalhada + '\'' +
                ", dataEntradaEstoque=" + dataEntradaEstoque +
                ", dataBaixaEstoque=" + dataBaixaEstoque +
                ", criadoEm=" + criadoEm +
                ", atualizadoEm=" + atualizadoEm +
                '}';
    }
}
