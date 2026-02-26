package br.com.mcgauto.dto.agenda;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record AgendamentoCreateRequestDTO(
        @NotNull (message = "Necessário informar o cliente")
        Long clienteId,

        @NotNull (message = "Necessário informar o serviço")
        Long servicoId,

        @NotNull (message = "Necessário informar o veículo do cliente")
        Long veiculoClienteId,

        @NotNull (message = "Necessário informar data e hora")
        LocalDateTime dataHoraServico
) {
}
