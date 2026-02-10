package br.com.mcgauto.dto.veiculo;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record VeiculoUpdateRequest(

        String nome,
        Long modeloId,
        String cor,

        @Size(min = 7, max = 7, message = "A placa deve ter 7 caracteres")
        String placa,
        String tipoModelo,
        int quilometragem,

        @Positive(message = "O preço de custo deve ser positivo")
        BigDecimal precoCusto,

        @Positive(message = "O preço de venda deve ser positivo")
        BigDecimal precoVenda,
        String descricaoDetalhada,
        String tipoCombustivel,
        String estadoVeiculo,
        String statusVeiculo
) {
}
