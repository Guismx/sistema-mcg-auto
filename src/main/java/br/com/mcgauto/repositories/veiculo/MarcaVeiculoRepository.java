package br.com.mcgauto.repositories.veiculo;

import br.com.mcgauto.domain.veiculo.MarcaVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaVeiculoRepository extends JpaRepository<MarcaVeiculo, Long> {
}
