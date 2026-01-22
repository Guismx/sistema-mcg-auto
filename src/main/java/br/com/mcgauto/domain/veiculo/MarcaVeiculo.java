package br.com.mcgauto.domain.veiculo;

import jakarta.persistence.*;

@Entity
@Table (name = "marcas_veiculo")
public class MarcaVeiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable = false, unique = true)
    private String nome;

    @Column (name = "pais_origem")
    private String paisOrigem;

    public MarcaVeiculo(){
    }

    public MarcaVeiculo(String nome, String paisOrigem) {
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
                '}';
    }
}
