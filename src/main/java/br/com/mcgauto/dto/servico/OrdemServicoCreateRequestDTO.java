package br.com.mcgauto.dto.servico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record OrdemServicoCreateRequestDTO(
        @NotNull(message = "O cliente é obrigatório")
        Long clienteId,

        // Opcional: Se vier de um agendamento prévio
        Long agendamentoId,

        @NotBlank(message = "A descrição do problema é obrigatória")
        String descricao
) {
}
