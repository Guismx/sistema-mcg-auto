package br.com.mcgauto.repository.agenda;

import br.com.mcgauto.domain.agenda.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AluguelRepository extends JpaRepository <Aluguel, Long> {
}
