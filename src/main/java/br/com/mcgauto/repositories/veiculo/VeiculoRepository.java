package br.com.mcgauto.repositories.veiculo;


import br.com.mcgauto.domain.veiculo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
