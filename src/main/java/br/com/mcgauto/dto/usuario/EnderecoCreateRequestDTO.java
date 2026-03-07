package br.com.mcgauto.dto.usuario;

import br.com.mcgauto.domain.usuario.enums.TipoEndereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record EnderecoCreateRequestDTO(
        @NotNull (message = "Informe o tipo de endereço")
        TipoEndereco tipoEndereco,

        @NotBlank(message = "O CEP é obrigatório")
        String cep,

        @NotBlank(message = "O logradouro é obrigatório")
        String logradouro,

        @NotBlank(message = "O número é obrigatório")
        String numero,

        String complemento,

        @NotBlank(message = "O bairro é obrigatório")
        String bairro,

        @NotBlank(message = "A cidade é obrigatória")
        String cidade,

        @NotBlank
        @Size(min = 2, max = 2, message = "A UF deve ter 2 letras")
        String uf
) {
}
