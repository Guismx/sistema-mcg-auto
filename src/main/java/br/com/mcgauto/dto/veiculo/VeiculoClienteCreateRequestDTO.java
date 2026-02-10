package br.com.mcgauto.dto.veiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record VeiculoClienteCreateRequestDTO(
        @NotBlank (message = "Necessário informar o nome do veículo")
        String nome,

        @NotBlank (message = "Necessário informar a marca do veículo")
        String marca,

        @NotBlank (message = "Necessário informar a placa")
        @Size(min = 7, max = 7, message = "A placa deve ter exatos 7 caracteres")
        String placa,

        @NotBlank (message = "Necessário informar o modelo")
        String modelo
) {
}
