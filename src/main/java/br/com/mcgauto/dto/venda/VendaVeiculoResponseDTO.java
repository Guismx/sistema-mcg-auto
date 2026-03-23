package br.com.mcgauto.dto.venda;

import br.com.mcgauto.domain.venda.enums.CanalVenda;
import br.com.mcgauto.domain.venda.enums.FormaPagamento;
import br.com.mcgauto.domain.venda.enums.StatusVenda;
import br.com.mcgauto.dto.usuario.UsuarioResponseDTO;
import br.com.mcgauto.dto.veiculo.VeiculoResponseDTO;

import java.math.BigDecimal;
import java.time.Instant;

public record VendaVeiculoResponseDTO(
        Long id,
        String codigoPedido,
        Integer numeroPedido,
        UsuarioResponseDTO cliente,
        UsuarioResponseDTO vendedor,
        UsuarioResponseDTO aprovador,
        VeiculoResponseDTO veiculo,
        Instant dataVenda,
        BigDecimal valorTotal,
        CanalVenda canalVenda,
        FormaPagamento formaPagamento,
        String observacoes,
        StatusVenda statusVenda
) {}