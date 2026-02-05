package br.com.mcgauto.dto.usuario;

import br.com.mcgauto.domain.usuario.enums.TipoEndereco;

public record EnderecoResponseDTO (
        Long id,
        TipoEndereco tipoEndereco,
        String cep,
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String uf
){}
