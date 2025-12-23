package br.com.mcgauto.domain.produto;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria_do_produto")
public class CategoriaProduto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    public CategoriaProduto (){
    }

    public CategoriaProduto(long id, String nome) {
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
}
