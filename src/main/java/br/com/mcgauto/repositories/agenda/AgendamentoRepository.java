package br.com.mcgauto.repositories.agenda;

import br.com.mcgauto.domain.agenda.Agendamento;
import br.com.mcgauto.domain.agenda.enums.StatusAgendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository <Agendamento, Long> {

    List<Agendamento> findByClienteId (Long clienteId);
    List<Agendamento> findByServicoId (Long servicoId);
    List<Agendamento> findByStatusAgendamentoEquals(StatusAgendamento status);
}
