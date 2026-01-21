package br.com.mcgauto.domain.produto;

import jakarta.persistence.*;
@Entity
@Table(name = "categoria_do_produto")
public class CategoriaProduto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable = false, unique = true)
    private String nome;

    public CategoriaProduto (){
    }

    public CategoriaProduto(String nome) {
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
        return "CategoriaProduto{id=" + id + ", nome='" + nome + "'}";
    }
}
