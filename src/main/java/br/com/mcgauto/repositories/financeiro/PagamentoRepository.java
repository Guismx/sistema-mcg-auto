package br.com.mcgauto.repositories.financeiro;

import br.com.mcgauto.domain.financeiro.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
