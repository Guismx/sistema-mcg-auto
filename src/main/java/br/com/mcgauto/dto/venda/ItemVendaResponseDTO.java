package br.com.mcgauto.dto.venda;

import java.math.BigDecimal;

public record ItemVendaResponseDTO(
        Long produtoId,
        String nomeProduto,
        Integer quantidade,
        BigDecimal precoUnitario,
        BigDecimal valorDesconto,
        BigDecimal subtotal
) {}