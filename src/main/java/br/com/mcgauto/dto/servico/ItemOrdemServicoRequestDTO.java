package br.com.mcgauto.dto.servico;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ItemOrdemServicoRequestDTO(
        Long produtoId,
        Long servicoId,

        @NotNull(message = "A quantidade é obrigatória")
        @Positive
        Integer quantidade
) {
}
