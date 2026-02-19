package br.com.mcgauto.dto.servico;

import br.com.mcgauto.domain.servico.enums.TipoServico;
import br.com.mcgauto.global.enums.StatusAtivacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ServicoResponseDTO(
        Long id,
        TipoServico tipoServico,
        String nome,
        String descricao,
        BigDecimal preco,
        int tempoServico,
        StatusAtivacao statusServico,
        LocalDateTime criadoEm
) {
}
