package br.com.mcgauto.dto.financeiro;

import br.com.mcgauto.domain.financeiro.enums.StatusPagamento;
import br.com.mcgauto.domain.financeiro.enums.TipoOrigem;
import br.com.mcgauto.domain.financeiro.enums.TipoPagamento;
import br.com.mcgauto.dto.servico.OrdemServicoResponseDTO;
import br.com.mcgauto.dto.venda.VendaResponseDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PagamentoResponseDTO(
        Long id,
        VendaResponseDTO venda,
        AluguelResponseDTO aluguel,
        OrdemServicoResponseDTO ordemServico,
        TipoOrigem tipoOrigem,
        LocalDateTime dataPagamento,
        BigDecimal valorPago,
        TipoPagamento tipoPagamento,
        StatusPagamento statusPagamento,
        String transacaoGateway,
        int parcelas
) {
}
