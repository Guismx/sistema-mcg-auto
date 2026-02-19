package br.com.mcgauto.dto.servico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.List;

public record OrdemServicoRequestDTO(
        @NotNull(message = "ID do agendamento é obrigatório")
        Long agendamentoId,

        @NotNull(message = "ID do cliente é obrigatório")
        Long clienteId,

        @NotBlank(message = "Descrição não pode ser vazia")
        String descricao,

        @NotNull(message = "Valor do serviço não pode ser nulo")
        @DecimalMin(value = "0.0", inclusive = true, message = "Valor do serviço não pode ser negativo")
        BigDecimal valorServico,

        @NotBlank(message = "Status é obrigatório")
        String status,

        @Valid
        List<ItemOrdemServicoRequestDTO> itens
) {
}
