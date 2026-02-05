package br.com.mcgauto.repository.veiculo;

import br.com.mcgauto.domain.veiculo.MarcaVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcaVeiculoRepository extends JpaRepository<MarcaVeiculo, Long> {


    //Buscar marcas pelo país
    List<MarcaVeiculo> findByPaisOrigem (String pais);

}
