package br.com.mcgauto.dto.usuario;

import br.com.mcgauto.domain.usuario.enums.TipoConta;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public record UsuarioCreateRequestDTO (
  @NotBlank(message = "Nome é obrigatório")
  String nome,

  @NotBlank (message = "Sobrenome é obrigatório")
  String sobrenome,

  @NotBlank (message = "CPF é obrigatório")
  @CPF(message = "CPF inválido")
  String cpf,

  @NotBlank (message = "E-mail é obrigatório")
  @Email(message = "Formato de email inválido")
  String email,

  @NotBlank
  @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
  String senha,

  @NotNull(message = "Data de nascimento é obrigatória")
  LocalDate dataNascimento,

  TipoConta tipoConta,

  String telefonePrincipal,

  String telefoneSecundario
){}
