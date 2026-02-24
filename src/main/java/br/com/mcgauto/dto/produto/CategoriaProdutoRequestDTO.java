package br.com.mcgauto.dto.produto;

import jakarta.validation.constraints.NotBlank;

public record CategoriaProdutoRequestDTO(
        @NotBlank (message = "Informe o nome da categoria")
        String nome
) {
}
