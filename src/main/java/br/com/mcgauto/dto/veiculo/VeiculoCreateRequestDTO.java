package br.com.mcgauto.dto.veiculo;

import br.com.mcgauto.domain.veiculo.enums.EstadoVeiculo;
import br.com.mcgauto.domain.veiculo.enums.TipoCombustivel;
import br.com.mcgauto.domain.veiculo.enums.TipoPropriedade;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record VeiculoCreateRequestDTO(

        @NotBlank(message = "O nome é obrigatório")
        String nome,

        @NotNull(message = "O modelo é obrigatório")
        Long modeloId,

        @NotNull(message = "Ano do modelo obrigatório")
        Integer anoModelo,

        @NotBlank(message = "A cor é obrigatória")
        String cor,

        @NotBlank(message = "A placa é obrigatória")
        @Size(min = 7, max = 7, message = "A placa deve ter 7 caracteres")
        String placa,

        @NotBlank(message = "O chassi é obrigatório")
        @Size(min = 17, max = 17, message = "O chassi deve ter 17 caracteres")
        String chassi,

        @NotNull(message = "A quilometragem é obrigatória")
        Integer quilometragem,

        @NotBlank(message = "O tipo do modelo é obrigatório")
        String tipoModelo,

        @NotNull(message = "Preço de custo obrigatório")
        @Positive
        BigDecimal precoCusto,

        @NotNull(message = "Preço de venda obrigatório")
        @Positive
        BigDecimal precoVenda,

        String descricaoDetalhada,

        @NotNull(message = "Tipo de combustível obrigatório")
        TipoCombustivel tipoCombustivel,

        @NotNull(message = "Estado obrigatório")
        EstadoVeiculo estadoVeiculo,

        @NotNull(message = "Tipo de propriedade obrigatório")
        TipoPropriedade tipoPropriedade
) {}