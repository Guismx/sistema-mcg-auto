package br.com.mcgauto.repositories.estoque;

import br.com.mcgauto.domain.estoque.MovimentacaoEstoque;
import br.com.mcgauto.domain.estoque.enums.TipoMovimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface MovimentacaoEstoqueRepository extends JpaRepository<MovimentacaoEstoque, Long> {
    List<MovimentacaoEstoque> findByResponsavelId (Long responsavelId);
    List<MovimentacaoEstoque> findByTipoMovimentacao (TipoMovimentacao tipo);
    List<MovimentacaoEstoque> findByDataHoraMovimentacaoBetween (LocalDateTime data);

}
