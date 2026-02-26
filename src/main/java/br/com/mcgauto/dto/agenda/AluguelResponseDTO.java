package br.com.mcgauto.dto.agenda;

import br.com.mcgauto.domain.agenda.enums.StatusAluguel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record AluguelResponseDTO(
        long id,
        int numeroAluguel,
        Long clienteId,
        String clienteNome,
        Long veiculoId,
        String veiculoPlaca,
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
        Long funcionarioConfirmacaoId,
        String funcionarioConfirmacaoNome,
        String observacoesCheckin,
        LocalDateTime criadoEm,
        LocalDateTime atualizadoEm
) {
}
