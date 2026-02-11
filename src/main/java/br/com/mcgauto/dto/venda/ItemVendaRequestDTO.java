package br.com.mcgauto.dto.venda;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

public record ItemVendaRequestDTO(

        @NotNull(message = "O ID do produto é obrigatório")
        Long produtoId,

        @NotNull(message = "A quantidade é obrigatória")
        @Positive(message = "A quantidade deve ser maior que zero")
        Integer quantidade,

        // Opcional: O vendedor pode dar um desconto específico neste item
        @PositiveOrZero(message = "O desconto não pode ser negativo")
        BigDecimal valorDesconto
) {}