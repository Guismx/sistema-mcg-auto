package br.com.mcgauto.dto.venda;

import br.com.mcgauto.domain.venda.enums.CanalVenda;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record VendaProdutoRequestDTO(
        @NotNull(message = "O ID do cliente é obrigatório")
        Long clienteId,

        @NotNull(message = "O ID do vendedor é obrigatório")
        Long vendedorId,

        @NotNull(message = "O canal da venda é obrigatório")
        CanalVenda canalVenda,

        @NotEmpty(message = "A lista de itens não pode estar vazia")
        @Valid
        List<ItemVendaRequestDTO> itens,

        @NotNull(message = "A forma de pagamento é obrigatória")
        FormaPagamento formaPagamento,

        String observacoes
) {
}
