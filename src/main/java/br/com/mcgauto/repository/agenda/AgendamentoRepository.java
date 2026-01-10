package br.com.mcgauto.repository.agenda;

import br.com.mcgauto.domain.agenda.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository <Agendamento, Long> {
}
