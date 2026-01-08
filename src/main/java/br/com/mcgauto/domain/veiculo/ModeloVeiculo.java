package br.com.mcgauto.domain.veiculo;


import br.com.mcgauto.domain.veiculo.enums.CategoriaVeiculo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "modelo_veiculo")
public class ModeloVeiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name =  "marca_id", nullable = false)
    private MarcaVeiculo marca;

    @NotBlank
    @Column (length = 50, nullable = false)
    private String nome;

    @NotNull
    @Enumerated (EnumType.STRING)
    private CategoriaVeiculo tipoVeiculo; //TODO: Alterar nome para categoria

    public ModeloVeiculo(){
    }

    public ModeloVeiculo(long id, MarcaVeiculo marca, String nome, CategoriaVeiculo tipoVeiculo) {
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

    public CategoriaVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(CategoriaVeiculo tipoVeiculo) {
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
