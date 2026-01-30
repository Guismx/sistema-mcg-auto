package br.com.mcgauto.repositories.venda;

import br.com.mcgauto.domain.venda.Venda;
import br.com.mcgauto.domain.venda.enums.CanalVenda;
import br.com.mcgauto.domain.venda.enums.TipoVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

    //Buscar pelo número do pedido
    Optional<Venda> findByNumeroPedido (int numero);

    //Filtar pelo tipo de venda
    List<Venda> findByTipoVenda (TipoVenda tipo);

    //Filtrar pelo tipo de canal
    List<Venda> findByCanalVenda (CanalVenda canal);

    //Buscar vendas por cliente
    List<Venda> findByClienteId (Long id);

    //Filtrar vendas de um vendedor
    List<Venda> findByVendedorId (Long id);

    //Filtrar Vendas que um gestor aprovou
    List<Venda> findByGestorAprovadorId (Long id);

    //Filtrar venda de um veículo
    List<Venda> findByVeiculoId (Long ind);

    //Filtrar vendas por data
    List<Venda> findByDataVendaBetween(LocalDateTime inicio, LocalDateTime fim);

    //Filtrar vendas pela forma de pagamento
    List<Venda> findByFormaPagamento (String forma);
}
