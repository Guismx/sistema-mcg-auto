package br.com.mcgauto.dto.estoque;

import br.com.mcgauto.domain.estoque.enums.TipoMovimentacao;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record MovimentacaoEstoqueRequestDTO(
        @NotNull(message = "O ID do produto é obrigatório")
        Long produtoId,

        @NotNull(message = "O tipo de movimentação é obrigatório")
        TipoMovimentacao tipoMovimentacao,

        @NotNull(message = "A quantidade é obrigatória")
        @Positive(message = "A quantidade deve ser maior que zero")
        Integer quantidade,

        String observacao //
) {
}
