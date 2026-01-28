package br.com.mcgauto.repositories.usuario;

import br.com.mcgauto.domain.usuario.Endereco;
import br.com.mcgauto.domain.usuario.enums.TipoEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    //Filtrar endereços de um usuário específico
    List<Endereco> findByProprietarioId (Long id);

    //Filtrar endereços por um tipo específico
    List<Endereco> findByTipoEndereco (TipoEndereco tipo);

    //Filtrar pela UF
    List<Endereco> findByUf (String uf);

    //Filtrar os endereços por cidade
    List<Endereco> findByCidade (String cidade);

    //Filtrar cidade
    List<Endereco> findByCep (String cep);

    //Validação para não cadastrar endereço duplicado
    boolean existsByProprietarioIdAndCep(Long proprietarioId, String cep);
}
