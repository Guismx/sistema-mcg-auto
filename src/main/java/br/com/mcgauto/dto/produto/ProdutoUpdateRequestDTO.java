package br.com.mcgauto.dto.produto;

import br.com.mcgauto.global.enums.StatusAtivacao;

import java.math.BigDecimal;

public record ProdutoUpdateRequestDTO (
        Long categoriaId,
        String nome,
        String descricao,
        String marca,
        BigDecimal precoCusto,
        BigDecimal precoVenda,
        int qtdEstoque,
        StatusAtivacao statusProduto
){
}
