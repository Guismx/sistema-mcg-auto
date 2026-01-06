package br.com.mcgauto.domain.veiculo;


import br.com.mcgauto.domain.veiculo.enums.TipoVeiculo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name = "modelo_veiculo")
public class ModeloVeiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name =  "marca_id", nullable = false)
    private MarcaVeiculo marca;

    @NotBlank
    private String nome;

    @Enumerated (EnumType.STRING)
    private TipoVeiculo tipoVeiculo; //TODO: Alterar nome para categoria

    public ModeloVeiculo(){
    }

    public ModeloVeiculo(long id, MarcaVeiculo marca, String nome, TipoVeiculo tipoVeiculo) {
        this.id = id;
        this.marca = marca;
        this.nome = nome;
        this.tipoVeiculo = tipoVeiculo;
    }

    public long getId() {
        return id;
    }

    public MarcaVeiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaVeiculo marca) {
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
                "id=" + id +
                ", marca=" + (marca != null ? marca.getNome() : null) +
                ", nome='" + nome + '\'' +
                ", tipoVeiculo=" + tipoVeiculo +
                '}';
    }
}
