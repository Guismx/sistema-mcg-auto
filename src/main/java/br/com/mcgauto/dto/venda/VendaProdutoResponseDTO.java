package br.com.mcgauto.dto.venda;

import br.com.mcgauto.domain.venda.enums.FormaPagamento;
import br.com.mcgauto.domain.venda.enums.StatusVenda;
import br.com.mcgauto.dto.usuario.UsuarioResponseDTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public record VendaProdutoResponseDTO(
        Long id,
        String codigoPedido,
        Integer numeroPedido,
        UsuarioResponseDTO cliente,
        UsuarioResponseDTO vendedor,
        List<ItemVendaResponseDTO> itens,
        Instant dataVenda,
        BigDecimal valorTotal,
        FormaPagamento formaPagamento,
        String observacoes,
        StatusVenda statusVenda
) {}