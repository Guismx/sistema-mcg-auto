package br.com.mcgauto.mapper.venda;

import br.com.mcgauto.domain.venda.ItemVenda;
import br.com.mcgauto.domain.venda.VendaProduto;
import br.com.mcgauto.dto.venda.ItemVendaRequestDTO;
import br.com.mcgauto.dto.venda.ItemVendaResponseDTO;
import br.com.mcgauto.dto.venda.VendaProdutoRequestDTO;
import br.com.mcgauto.dto.venda.VendaProdutoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VendaProdutoMapper {

    @Mapping(target = "cliente", ignore = true)
    @Mapping(target = "vendedor", ignore = true)
    @Mapping(target = "itens", ignore = true)
    VendaProduto toEntity(VendaProdutoRequestDTO dto);

    VendaProdutoResponseDTO toResponseDTO(VendaProduto venda);

    //Mapeamento dos Itens da Venda
    @Mapping(target = "produto", ignore = true)
    ItemVenda toItemEntity(ItemVendaRequestDTO dto);

    @Mapping(source = "produto.id", target = "produtoId")
    @Mapping(source = "produto.nome", target = "nomeProduto")
    ItemVendaResponseDTO toItemResponseDTO(ItemVenda item);
}