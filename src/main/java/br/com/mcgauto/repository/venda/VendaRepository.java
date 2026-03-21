package br.com.mcgauto.repository.venda;

import br.com.mcgauto.domain.venda.VendaVeiculo;
import br.com.mcgauto.domain.venda.enums.CanalVenda;
import br.com.mcgauto.domain.venda.enums.TipoVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface VendaRepository extends JpaRepository<VendaVeiculo, Long> {

    //Buscar pelo número do pedido
    Optional<VendaVeiculo> findByNumeroPedido (int numero);

    //Filtar pelo tipo de venda
    List<VendaVeiculo> findByTipoVenda (TipoVenda tipo);

    //Filtrar pelo tipo de canal
    List<VendaVeiculo> findByCanalVenda (CanalVenda canal);

    //Buscar vendas por cliente
    List<VendaVeiculo> findByClienteId (Long id);

    //Filtrar vendas de um vendedor
    List<VendaVeiculo> findByVendedorId (Long id);

    //Filtrar Vendas que um gestor aprovou
    List<VendaVeiculo> findByGestorAprovadorId (Long id);

    //Filtrar venda de um veículo
    List<VendaVeiculo> findByVeiculoId (Long ind);

    //Filtrar vendas por data
    List<VendaVeiculo> findByDataVendaBetween(LocalDateTime inicio, LocalDateTime fim);

    //Filtrar vendas pela forma de pagamento
    List<VendaVeiculo> findByFormaPagamento (String forma);
}
