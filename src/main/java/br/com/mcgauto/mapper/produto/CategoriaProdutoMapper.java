package br.com.mcgauto.mapper.produto;

import br.com.mcgauto.domain.produto.CategoriaProduto;
import br.com.mcgauto.dto.produto.CategoriaProdutoRequestDTO;
import br.com.mcgauto.dto.produto.CategoriaProdutoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoriaProdutoMapper {

    CategoriaProduto toEntity(CategoriaProdutoRequestDTO dto);

    CategoriaProdutoResponseDTO toResponse(CategoriaProduto categoria);

    List<CategoriaProdutoResponseDTO> toListResponse(List<CategoriaProduto> categoria);

    void updateEntityFromDTO (CategoriaProdutoRequestDTO dto, @MappingTarget CategoriaProduto categoria);
}
