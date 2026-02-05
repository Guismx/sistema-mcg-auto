package br.com.mcgauto.dto.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record CnhRequestDTO(
        @NotBlank(message = "O número da CNH é obrigatório")
        @Size(min = 11, max = 11)
        String numeroCnh,

        @NotNull(message = "Data de validade obrigatório")
        LocalDate validade,

        @NotBlank(message = "informe a categoria")
        @Size(min = 1, max = 2)
        String categoria
) {
}
