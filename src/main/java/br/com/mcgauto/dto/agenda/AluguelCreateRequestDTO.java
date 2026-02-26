package br.com.mcgauto.dto.agenda;

import br.com.mcgauto.domain.agenda.enums.StatusAluguel;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;

public record AluguelCreateRequestDTO(
        @NotNull (message = "ID do cliente obrigatório")
        Long clienteId,

        @NotNull (message = "ID do veículo obrigatório")
        Long veiculoId,

        @NotNull
        LocalDate dataRetiradaPrevista,

        @NotNull
        LocalDate dataDevolucaoPrevista,

        @Positive
        @NotNull
        int kmRetirada,

        @NotNull
        BigDecimal valorDiaria,

        BigDecimal valorCaucao,
        StatusAluguel statusAluguel,
        String observacoesCheckin
) {
}
