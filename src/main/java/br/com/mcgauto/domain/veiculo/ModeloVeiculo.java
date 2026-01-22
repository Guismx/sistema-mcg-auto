package br.com.mcgauto.domain.veiculo;


import br.com.mcgauto.domain.veiculo.enums.CategoriaVeiculo;
import jakarta.persistence.*;

@Entity
@Table (name = "modelo_veiculo")
public class ModeloVeiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name =  "marca_id", nullable = false)
    private MarcaVeiculo marca;

    @Column(nullable = false)
    private String nome;

    @Enumerated (EnumType.STRING)
    @Column (name = "categoria_veiculo")
    private CategoriaVeiculo categoria;

    public ModeloVeiculo(){
    }

    public ModeloVeiculo(MarcaVeiculo marca, String nome, CategoriaVeiculo categoria) {
        this.marca = marca;
        this.nome = nome;
        this.categoria = categoria;
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

    public CategoriaVeiculo getCategoria() {
        return categoria;
    }
    public void setCategoria(CategoriaVeiculo categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ModeloVeiculo{" +
                "id=" + id +
                ", marca=" + (marca != null ? marca.getNome() : null) +
                ", nome='" + nome + '\'' +
                ", tipoVeiculo=" + categoria +
                '}';
    }
}
