package br.com.mcgauto.mapper.venda;

import br.com.mcgauto.domain.venda.VendaProduto;
import br.com.mcgauto.dto.venda.VendaProdutoRequestDTO;
import br.com.mcgauto.dto.venda.VendaProdutoResponseDTO;
import br.com.mcgauto.mapper.usuario.UsuarioMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {UsuarioMapper.class, ItemVendaMapper.class})
public interface VendaProdutoMapper {

    VendaProduto toEntity(VendaProdutoRequestDTO dto);

    VendaProdutoResponseDTO toResponseDTO(VendaProduto entity);

    List<VendaProdutoResponseDTO> toResponseDTOList(List<VendaProduto> entities);
}