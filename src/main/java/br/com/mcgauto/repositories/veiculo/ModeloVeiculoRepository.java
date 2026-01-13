package br.com.mcgauto.repositories.veiculo;

import br.com.mcgauto.domain.veiculo.ModeloVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloVeiculoRepository extends JpaRepository<ModeloVeiculo, Long> {
}
