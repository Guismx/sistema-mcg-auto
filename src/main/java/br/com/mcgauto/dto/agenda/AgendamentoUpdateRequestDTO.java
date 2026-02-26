package br.com.mcgauto.dto.agenda;

import br.com.mcgauto.domain.agenda.enums.StatusAgendamento;

import java.time.LocalDateTime;

public record AgendamentoUpdateRequestDTO(
        Long clienteId,
        Long servicoId,
        Long veiculoClienteId,
        LocalDateTime dataHoraServico,
        StatusAgendamento statusAgendamento
) {
}
