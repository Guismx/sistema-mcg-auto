package br.com.mcgauto.repositories.usuario;

import br.com.mcgauto.domain.usuario.Cnh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CnhRepository extends JpaRepository<Cnh, Long> {
}
