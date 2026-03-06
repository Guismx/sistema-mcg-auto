package br.com.mcgauto.dto.servico;

import br.com.mcgauto.domain.servico.enums.TipoServico;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ServicoUpdateRequestDTO(
        TipoServico tipoServico,
        String nome,
        String descricao,

        @PositiveOrZero
        BigDecimal preco,

        @Positive
        int tempoServico
) {
}
