package br.com.mcgauto.domain.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "marca_veiculo")
public class MarcaVeiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idMarca;
    private String nome;

    public MarcaVeiculo(){}

    public MarcaVeiculo(long idMarca, String nome) {
        this.idMarca = idMarca;
        this.nome = nome;
    }

    public long getIdMarca() {
        return idMarca;
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
                "idMarca=" + idMarca +
                ", nome='" + nome + '\'' +
                '}';
    }
}
