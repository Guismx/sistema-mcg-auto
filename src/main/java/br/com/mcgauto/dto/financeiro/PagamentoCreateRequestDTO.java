package br.com.mcgauto.dto.financeiro;


import br.com.mcgauto.domain.financeiro.enums.TipoOrigem;
import br.com.mcgauto.domain.financeiro.enums.TipoPagamento;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PagamentoCreateRequestDTO(
        Long vendaId,
        Long aluguelId,
        Long ordemServicoId,

        @NotNull (message = "Necessário a origem do pagamento")
        TipoOrigem tipoOrigem,

        @NotNull (message = "Data de pagamento obrigatório")
        LocalDateTime dataPagamento,

        @NotNull (message = "Obrigado informar o valor pago")
        @Positive
        BigDecimal valorPago,

        @NotNull (message = "Obrigado informar a forma de pagamento")
        TipoPagamento formaPagamento,
        String transacaoGateway,
        int parcelas
) {
}
