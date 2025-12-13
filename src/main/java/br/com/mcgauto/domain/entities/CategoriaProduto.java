package br.com.mcgauto.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria_do_produto")
public class CategoriaProduto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idCategoriaProduto;
    private String nome;

    public CategoriaProduto (){
    }

    public CategoriaProduto(long idCategoriaProduto, String nome) {
        this.idCategoriaProduto = idCategoriaProduto;
        this.nome = nome;
    }

    public long getIdCategoriaProduto() {
        return idCategoriaProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
