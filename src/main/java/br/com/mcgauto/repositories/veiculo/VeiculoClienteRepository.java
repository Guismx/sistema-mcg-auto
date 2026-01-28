package br.com.mcgauto.repositories.veiculo;

import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.domain.veiculo.VeiculoCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VeiculoClienteRepository extends JpaRepository<VeiculoCliente, Long> {

    //Buscar pelo dono
    List<VeiculoCliente> findByDonoId (Long id);

    //Buscar pela marca do veículo
    List<VeiculoCliente> findByMarcaContainingIgnoreCase(String marca);

    //Buscar pelo nome do veículo
    List<VeiculoCliente> findByNomeContainingIgnoreCase(String nome);

    //Buscar pela placa
    Optional<VeiculoCliente> findByPlaca (String placa);

    //Buscar pelo modelo
    List<VeiculoCliente> findByModeloContainingIgnoreCase(String modelo);

    //Filtro para validar se a placa é única
    boolean existsByPlaca (String placa);

}
