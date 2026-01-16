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
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name =  "marca_id", nullable = false)
    private MarcaVeiculo marca;
    private String nome;
    @Enumerated (EnumType.STRING)
    @Column (name = "categoria_veiculo")
    private CategoriaVeiculo categoriaVeiculo; //TODO: Alterar nome para categoria

    public ModeloVeiculo(){
    }

    public ModeloVeiculo(long id, MarcaVeiculo marca, String nome, CategoriaVeiculo categoriaVeiculo) {
        this.id = id;
        this.marca = marca;
        this.nome = nome;
        this.categoriaVeiculo = categoriaVeiculo;
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
        return categoriaVeiculo;
    }

    public void setTipoVeiculo(CategoriaVeiculo tipoVeiculo) {
        this.categoriaVeiculo = tipoVeiculo;
    }

    @Override
    public String toString() {
        return "ModeloVeiculo{" +
                "id=" + id +
                ", marca=" + (marca != null ? marca.getNome() : null) +
                ", nome='" + nome + '\'' +
                ", tipoVeiculo=" + categoriaVeiculo +
                '}';
    }
}
