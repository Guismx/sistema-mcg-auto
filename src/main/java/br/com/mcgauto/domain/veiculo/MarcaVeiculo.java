package br.com.mcgauto.domain.veiculo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "marcas_veiculo")
public class MarcaVeiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Column (name = "pais_origem")
    private String paisOrigem;

    public MarcaVeiculo(){}

    public MarcaVeiculo(long id, String nome, String paisOrigem) {
        this.id = id;
        this.nome = nome;
        this.paisOrigem = paisOrigem;
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

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public String toString() {
        return "MarcaVeiculo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", paisOrigem='" + paisOrigem + '\'' +
                '}';
    }
}
