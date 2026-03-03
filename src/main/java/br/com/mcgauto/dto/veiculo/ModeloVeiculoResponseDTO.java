package br.com.mcgauto.dto.veiculo;

import br.com.mcgauto.domain.veiculo.enums.CategoriaVeiculo;

public record ModeloVeiculoResponseDTO(
      Long id,
      MarcaVeiculoResponseDTO marcaVeiculo,
      String nome,
      CategoriaVeiculo categoriaVeiculo
){
}
