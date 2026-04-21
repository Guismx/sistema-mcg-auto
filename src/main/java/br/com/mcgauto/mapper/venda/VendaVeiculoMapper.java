package br.com.mcgauto.mapper.venda;

import br.com.mcgauto.domain.venda.VendaVeiculo;
import br.com.mcgauto.dto.venda.VendaVeiculoRequestDTO;
import br.com.mcgauto.dto.venda.VendaVeiculoResponseDTO;
import br.com.mcgauto.mapper.usuario.UsuarioMapper;
import br.com.mcgauto.mapper.veiculo.VeiculoMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {UsuarioMapper.class, VeiculoMapper.class})
public interface VendaVeiculoMapper {

    VendaVeiculo toEntity(VendaVeiculoRequestDTO dto);

    VendaVeiculoResponseDTO toResponseDTO(VendaVeiculo entity);

    List<VendaVeiculoResponseDTO> toResponseDTOList(List<VendaVeiculo> entities);
}