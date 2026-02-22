package br.com.mcgauto.dto.veiculo;

import br.com.mcgauto.domain.veiculo.MarcaVeiculo;
import br.com.mcgauto.domain.veiculo.enums.CategoriaVeiculo;

public record ModeloResponseDTO (
      Long id,
      MarcaVeiculo marcaVeiculo,
      String nome,
      CategoriaVeiculo categoriaVeiculo
){
}
