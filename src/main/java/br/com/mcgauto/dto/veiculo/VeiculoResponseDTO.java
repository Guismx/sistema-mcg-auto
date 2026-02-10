package br.com.mcgauto.dto.veiculo;

import br.com.mcgauto.domain.veiculo.enums.EstadoVeiculo;
import br.com.mcgauto.domain.veiculo.enums.StatusVeiculo;
import br.com.mcgauto.domain.veiculo.enums.TipoCombustivel;
import br.com.mcgauto.domain.veiculo.enums.TipoPropriedade;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record VeiculoResponseDTO(
        Long id,
        String nome,
        ModeloResponseDTO modelo,
        Integer anoModelo,
        String cor,
        String placa,
        String chassi,
        String tipoModelo,
        Integer quilometragem,
        BigDecimal precoVenda,
        String descricaoDetalhada,
        TipoCombustivel tipoCombustivel,
        EstadoVeiculo estadoVeiculo,
        StatusVeiculo statusVeiculo,
        TipoPropriedade tipoPropriedade,
        LocalDateTime dataEntradaEstoque
) {}