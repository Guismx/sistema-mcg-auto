package br.com.mcgauto.repositories.agenda;

import br.com.mcgauto.domain.agenda.Aluguel;
import br.com.mcgauto.domain.veiculo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AluguelRepository extends JpaRepository <Aluguel, Long> {
    List<Aluguel> findByClienteId(Long clienteId);
    List<Veiculo> findByVeiculoId(Long veiculoId);

    //Carros que saem hoje (Retirada)
    List<Aluguel> findByDataRetiradaPrevista(LocalDate hoje);
    //Carros que voltam hoje (Devolução)
    List<Aluguel> findByDataDevolucaoPrevista(LocalDate hoje);
}
