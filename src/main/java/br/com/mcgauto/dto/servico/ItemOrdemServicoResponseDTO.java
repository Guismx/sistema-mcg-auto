package br.com.mcgauto.dto.servico;

import br.com.mcgauto.domain.servico.enums.TipoOrdem;

import java.math.BigDecimal;

public record ItemOrdemServicoResponseDTO(
        Long id,
        String descricao,
        TipoOrdem tipoItem,
        Integer quantidade,
        BigDecimal precoUnitario,
        BigDecimal valorTotal
) {
}
