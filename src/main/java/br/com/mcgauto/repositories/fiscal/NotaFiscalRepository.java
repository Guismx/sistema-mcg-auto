package br.com.mcgauto.repositories.fiscal;


import br.com.mcgauto.domain.fiscal.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long> {
}
