package br.com.mcgauto.dto.servico;

import br.com.mcgauto.domain.servico.enums.TipoServico;
import br.com.mcgauto.global.enums.StatusAtivacao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ServicoCreateRequestDTO(
        @NotNull (message = "Informe o tipo do Serviço")
        TipoServico tipoServico,

        @NotBlank (message = "O nome do serviço é obrigatório")
        String nome,

        @NotBlank (message = "Necessário adicionar uma descrição")
        String descricao,

        @PositiveOrZero
        BigDecimal preco,

        @Positive
        Integer tempoServico
) {
}
