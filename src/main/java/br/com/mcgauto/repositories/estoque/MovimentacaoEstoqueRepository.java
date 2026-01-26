package br.com.mcgauto.repositories.estoque;

import br.com.mcgauto.domain.estoque.MovimentacaoEstoque;
import br.com.mcgauto.domain.estoque.enums.TipoMovimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MovimentacaoEstoqueRepository extends JpaRepository<MovimentacaoEstoque, Long> {
    List<MovimentacaoEstoque> findByResponsavel (Long id);
    List<MovimentacaoEstoque> findByTipoMovimentacaoEquals (TipoMovimentacao tipo);
    List<MovimentacaoEstoque> findByDataHoraMovimentacaoEquals (LocalDate data);

}
