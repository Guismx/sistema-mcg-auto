package br.com.mcgauto.repositories.usuario;

import br.com.mcgauto.domain.usuario.Cnh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CnhRepository extends JpaRepository<Cnh, Long> {

    //Buscar pelo número da CNH
    Optional<Cnh> findByNumeroCnh(String numeroCnh);

    //Filtrar pela categoria
    List<Cnh> findByCategoria(String categoria);
}
