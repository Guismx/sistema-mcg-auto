package br.com.mcgauto.dto.agenda;

import br.com.mcgauto.domain.agenda.enums.StatusAgendamento;
import br.com.mcgauto.dto.servico.ServicoResponseDTO;
import br.com.mcgauto.dto.usuario.UsuarioResponseDTO;
import br.com.mcgauto.dto.veiculo.VeiculoClienteResponseDTO;

import java.time.LocalDateTime;

public record AgendamentoResponseDTO(
        Long id,
        UsuarioResponseDTO cliente,
        ServicoResponseDTO servico,
        VeiculoClienteResponseDTO veiculoCliente,
        LocalDateTime dataHoraServico,
        int estimativaTempo,
        StatusAgendamento statusAgendamento
) {
}
