package br.com.mcgauto.dto.veiculo;

import java.time.LocalDateTime;

public record VeiculoClienteResponseDTO(
        Long id,
        String nome,
        String marca,
        String modelo,
        String placa,
        LocalDateTime criadoEm
) {
}
