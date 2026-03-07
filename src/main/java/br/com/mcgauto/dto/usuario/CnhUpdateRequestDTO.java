package br.com.mcgauto.dto.usuario;

import java.time.LocalDate;

public record CnhUpdateRequestDTO(
        String numeroCnh,
        LocalDate validade,
        String categoria
) {
}
