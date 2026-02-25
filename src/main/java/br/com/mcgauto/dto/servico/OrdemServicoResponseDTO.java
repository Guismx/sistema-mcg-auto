package br.com.mcgauto.dto.servico;

import br.com.mcgauto.dto.usuario.UsuarioResponseDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record OrdemServicoResponseDTO(
        Long id,
        Integer numeroOrdem,
        Long agendamentoId,
        String descricao,
        BigDecimal valorServico,
        String status,
        LocalDateTime dataAbertura,
        LocalDateTime dataFechamento,
        LocalDateTime atualizadoEm,
        UsuarioResponseDTO cliente,
        List<ItemOrdemServicoResponseDTO> itens
) {
}