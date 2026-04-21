package br.com.mcgauto.mapper.veiculo;

import br.com.mcgauto.domain.veiculo.ModeloVeiculo;
import br.com.mcgauto.dto.veiculo.ModeloVeiculoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {MarcaVeiculoMapper.class})
public interface ModeloVeiculoMapper {

    ModeloVeiculoResponseDTO toResponseDTO(ModeloVeiculo entity);

    List<ModeloVeiculoResponseDTO> toResponseDTOList(List<ModeloVeiculo> entities);
}