package br.com.mcgauto.dto.financeiro;

import br.com.mcgauto.domain.financeiro.enums.StatusPagamento;
import br.com.mcgauto.domain.financeiro.enums.TipoOrigem;
import br.com.mcgauto.domain.financeiro.enums.TipoPagamento;
import br.com.mcgauto.dto.agenda.AluguelResponseDTO;
import br.com.mcgauto.dto.servico.OrdemServicoResponseDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PagamentoResponseDTO(
        Long id,
        AluguelResponseDTO aluguel,
        OrdemServicoResponseDTO ordemServico,
        TipoOrigem tipoOrigem,
        LocalDateTime dataPagamento,
        BigDecimal valorPago,
        TipoPagamento formaPagamento,
        StatusPagamento statusPagamento,
        String transacaoGateway,
        int parcelas
) {
}
