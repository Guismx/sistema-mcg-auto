package br.com.mcgauto.repositories.veiculo;

import br.com.mcgauto.domain.veiculo.ModeloVeiculo;
import br.com.mcgauto.domain.veiculo.enums.CategoriaVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModeloVeiculoRepository extends JpaRepository<ModeloVeiculo, Long> {

    //Busca pela marca
    List<ModeloVeiculo> findByMarcaId(Long marcaId);

    //Filtro por Categoria (Ex: Listar apenas SUV ou HATCH)
    List<ModeloVeiculo> findByCategoria(CategoriaVeiculo categoria);

    //Busca por Nome (Para autocomplete)
    List<ModeloVeiculo> findByNomeContainingIgnoreCase(String nome);
}
