package br.com.mcgauto.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produtos {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id_produto;
    private int categoria_id;
    private int codigo_produto;
    private String nome;
    private String descricao;
    private String marca;
    private BigDecimal preco_custo;
    private BigDecimal preco_venda;
    private int qtd_estoque;
    private boolean is_ativo; //TODO: Alterar tipo depois
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
