package br.com.mcgauto.dto.venda;

import br.com.mcgauto.domain.venda.enums.CanalVenda;
import br.com.mcgauto.domain.venda.enums.FormaPagamento;
import br.com.mcgauto.domain.venda.enums.StatusVenda;
import br.com.mcgauto.domain.venda.enums.TipoVenda;
import br.com.mcgauto.dto.usuario.UsuarioResponseDTO;
import br.com.mcgauto.dto.veiculo.VeiculoResponseDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record VendaResponseDTO(
        Long id,
        String codigoPedido,
        Integer numeroPedido,
        LocalDateTime dataVenda,
        BigDecimal valorTotal,
        TipoVenda tipoVenda,
        CanalVenda canalVenda,
        StatusVenda statusVenda,
        FormaPagamento formaPagamento,
        String observacoes,
        UsuarioResponseDTO cliente,

        //Pode ser null (venda web)
        UsuarioResponseDTO vendedor,

        //Pode ser null
        UsuarioResponseDTO gestorAprovador,

        //Se for Venda de Veículo, este campo vem preenchido e a lista abaixo vazia
        VeiculoResponseDTO veiculo,

        //Se for Venda de Produto, esta lista vem preenchida e o veículo acima nulo
        List<ItemVendaResponseDTO> itens
) {
}
