package br.com.mcgauto.repositories.veiculo;

import br.com.mcgauto.domain.veiculo.VeiculoCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoClienteRepository extends JpaRepository<VeiculoCliente, Long> {
}
