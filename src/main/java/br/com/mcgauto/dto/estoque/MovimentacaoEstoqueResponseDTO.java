package br.com.mcgauto.dto.estoque;

import br.com.mcgauto.domain.estoque.enums.TipoMovimentacao;

import java.time.LocalDateTime;

public record MovimentacaoEstoqueResponseDTO(
        Long id,
        Long produtoId,
        String nomeProduto,
        TipoMovimentacao tipoMovimentacao,
        Integer quantidade,
        String observacao,
        LocalDateTime dataMovimentacao
) {
}
