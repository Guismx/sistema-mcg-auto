package br.com.mcgauto.domain.veiculo;

import jakarta.persistence.*;

@Entity
@Table (name = "marca_veiculo")
public class MarcaVeiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    public MarcaVeiculo(){}

    public MarcaVeiculo(long id, String nome) {
        this.id = id;
        this.nome = nome;
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

    @Override
    public String toString() {
        return "MarcaVeiculo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
