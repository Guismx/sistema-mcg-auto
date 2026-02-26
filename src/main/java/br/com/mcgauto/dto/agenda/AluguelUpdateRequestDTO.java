package br.com.mcgauto.dto.agenda;

import br.com.mcgauto.domain.agenda.enums.StatusAluguel;

import java.math.BigDecimal;
import java.time.LocalDate;

public record AluguelUpdateRequestDTO(
        Long clienteId,
        Long veiculoId,
        LocalDate dataRetiradaPrevista,
        LocalDate dataDevolucaoPrevista,
        LocalDate dataDaRetirada,
        LocalDate dataDeDevolucao,
        int kmRetirada,
        int kmDevolucao,
        BigDecimal valorDiaria,
        BigDecimal valorCaucao,
        BigDecimal valorTotalPrevisto,
        BigDecimal valorAdicionalAvarias,
        BigDecimal valorAdicionalKmExcedentes,
        StatusAluguel statusAluguel,
        String observacoesCheckin
) {
}
