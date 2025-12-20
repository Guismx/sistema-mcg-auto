package br.com.mcgauto.domain.veiculo;


import jakarta.persistence.*;

@Entity
@Table (name = "modelo_veiculo")
public class ModeloVeiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long modeloId;
    private Marca marca;
    private String nome;
    private TipoVeiculo tipoVeiculo;

    public ModeloVeiculo(){
    }

    public ModeloVeiculo(long modeloId, Marca marca, String nome, TipoVeiculo tipoVeiculo) {
        this.modeloId = modeloId;
        this.marca = marca;
        this.nome = nome;
        this.tipoVeiculo = tipoVeiculo;
    }

    public long getModeloId() {
        return modeloId;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public String toString() {
        return "ModeloVeiculo{" +
                "modeloId=" + modeloId +
                ", marca=" + marca +
                ", nome='" + nome + '\'' +
                ", tipoVeiculo=" + tipoVeiculo +
                '}';
    }
}
