package br.com.mcgauto.repositories.servico;

import br.com.mcgauto.domain.servico.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
