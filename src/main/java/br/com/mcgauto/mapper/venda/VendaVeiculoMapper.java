package br.com.mcgauto.mapper.venda;

import br.com.mcgauto.domain.venda.VendaVeiculo;
import br.com.mcgauto.dto.venda.VendaVeiculoRequestDTO;
import br.com.mcgauto.dto.venda.VendaVeiculoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VendaVeiculoMapper {

    @Mapping(target = "cliente", ignore = true)
    @Mapping(target = "vendedor", ignore = true)
    @Mapping(target = "veiculo", ignore = true)
    VendaVeiculo toEntity(VendaVeiculoRequestDTO dto);

    VendaVeiculoResponseDTO toResponseDTO(VendaVeiculo venda);

    List<VendaVeiculoResponseDTO> toResponseDTOList(List<VendaVeiculo> vendas);
}