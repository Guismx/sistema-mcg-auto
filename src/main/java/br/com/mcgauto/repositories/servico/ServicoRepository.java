package br.com.mcgauto.repositories.servico;

import br.com.mcgauto.domain.servico.Servico;
import br.com.mcgauto.domain.servico.enums.TipoServico;
import br.com.mcgauto.global.enums.StatusAtivacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

    //Filtrar pelo tipo de serviço
    List<Servico> findByTipoServico (TipoServico tipo);

    //Filtrar pelo Status de um serviço
    List<Servico> findByStatusServico(StatusAtivacao status);

    //Filtrar por Tipo e status de serviço
    List<Servico> findByTipoServicoAndStatusServico(TipoServico tipo, StatusAtivacao status);

    //Filtrar um serviço por algum nome
    List<Servico> findByNomeContainingIgnoreCase(String nome);

    //Filtrar por um preço
    List<Servico> findByPrecoLessThanEqual(BigDecimal precoMaximo);
}
