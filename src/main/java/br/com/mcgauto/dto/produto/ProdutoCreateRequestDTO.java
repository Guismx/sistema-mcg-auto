package br.com.mcgauto.dto.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProdutoCreateRequestDTO(
        @NotNull (message = "Necessário informar a categoria do produto.")
        Long categoriaId,

        @NotBlank (message = "Nome do produto obrigatório.")
        String nome,

        String descricao,
        String marca,

        @NotNull (message = "Necessário informar o preco de custo do produto")
        @PositiveOrZero
        BigDecimal precoCusto,

        @NotNull (message = "Necessário informar o preço de venda do produto")
        @PositiveOrZero
        BigDecimal precoVenda,

        @NotNull (message = "Necessário informar a quantidade do produto")
        @Positive
        int qtdEstoque
) {
}
