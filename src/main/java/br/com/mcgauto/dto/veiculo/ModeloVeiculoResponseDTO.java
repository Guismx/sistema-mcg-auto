package br.com.mcgauto.dto.veiculo;

import br.com.mcgauto.domain.veiculo.enums.CategoriaVeiculo;

public record ModeloVeiculoResponseDTO(
      Long id,
      MarcaVeiculoResponseDTO marca,
      String nome,
      CategoriaVeiculo categoria
){
}
