package br.com.mcgauto.dto.veiculo;

import br.com.mcgauto.domain.veiculo.enums.CategoriaVeiculo;

public record ModeloResponseDTO (
      Long id,
      MarcaVeiculoResponseDTO marcaVeiculo,
      String nome,
      CategoriaVeiculo categoriaVeiculo
){
}
