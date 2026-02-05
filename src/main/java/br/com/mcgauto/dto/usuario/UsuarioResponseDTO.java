package br.com.mcgauto.dto.usuario;

import br.com.mcgauto.domain.usuario.enums.TipoConta;

import java.time.LocalDate;

public record UsuarioResponseDTO(
        Long id,
        String nome,
        String sobrenome,
        String cpf,
        String email,
        LocalDate dataNascimento,
        TipoConta tipoConta,
        String telefonePrincipal,
        String telefoneSecundario,
        boolean emailValidado
) {
}
