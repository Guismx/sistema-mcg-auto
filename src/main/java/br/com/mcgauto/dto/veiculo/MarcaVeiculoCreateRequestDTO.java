package br.com.mcgauto.dto.veiculo;

import jakarta.validation.constraints.NotBlank;

public record MarcaVeiculoCreateRequestDTO(
        @NotBlank
        String nome,

        @NotBlank
        String paisOrigem
) {
}
