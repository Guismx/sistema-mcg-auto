package br.com.mcgauto.mapper.venda;

import br.com.mcgauto.domain.venda.ItemVenda;
import br.com.mcgauto.dto.venda.ItemVendaRequestDTO;
import br.com.mcgauto.dto.venda.ItemVendaResponseDTO;
import br.com.mcgauto.mapper.produto.ProdutoMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {ProdutoMapper.class})
public interface ItemVendaMapper {

    ItemVenda toEntity(ItemVendaRequestDTO dto);

    ItemVendaResponseDTO toResponseDTO(ItemVenda entity);

    List<ItemVendaResponseDTO> toResponseDTOList(List<ItemVenda> entities);
}