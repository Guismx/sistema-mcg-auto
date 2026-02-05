package br.com.mcgauto.dto.usuario;

import java.time.LocalDate;

public record CnhResponseDTO(
        Long id,
        String numeroCnh,
        LocalDate validade,
        String categoria
) {
}
