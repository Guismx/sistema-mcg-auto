package br.com.mcgauto.dto.venda;

import br.com.mcgauto.domain.venda.enums.CanalVenda;
import br.com.mcgauto.domain.venda.enums.FormaPagamento;
import jakarta.validation.constraints.NotNull;

public record VendaVeiculoRequestDTO(
        @NotNull(message = "O ID do cliente é obrigatório")
        Long clienteId,

        @NotNull(message = "O ID do vendedor é obrigatório")
        Long vendedorId,

        @NotNull(message = "O ID do veículo é obrigatório")
        Long veiculoId,

        @NotNull(message = "O canal da venda é obrigatório")
        CanalVenda canalVenda,

        @NotNull(message = "A forma de pagamento é obrigatória")
        FormaPagamento formaPagamento,

        String observacoes
) {
}
