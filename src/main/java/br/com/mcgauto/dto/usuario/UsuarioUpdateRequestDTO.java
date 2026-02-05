package br.com.mcgauto.dto.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record UsuarioUpdateRequestDTO (
        @NotBlank(message = "Nome é obrigatório")
        String nome,

        @NotBlank(message = "Sobrenome é obrigatório")
        String sobrenome,

        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Formato de email inválido")
        String email,

        @NotNull(message = "Data de nascimento é obrigatória")
        LocalDate dataNascimento,

        String telefonePrincipal,

        String telefoneSecundario
){}
