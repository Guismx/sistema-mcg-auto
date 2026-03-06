package br.com.mcgauto.mapper.produto;

import br.com.mcgauto.domain.produto.Produto;
import br.com.mcgauto.dto.produto.ProdutoCreateRequestDTO;
import br.com.mcgauto.dto.produto.ProdutoResponseDTO;
import br.com.mcgauto.dto.produto.ProdutoUpdateRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProdutoMapper {

    Produto toEntity(ProdutoCreateRequestDTO dto);

    ProdutoResponseDTO toResponse(Produto produto);

    List<ProdutoResponseDTO> toListResponse (List<Produto> produtos);

    void updateEntityFromDTO(ProdutoUpdateRequestDTO dto, @MappingTarget Produto produto);
}
