package br.com.mcgauto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idUsuario;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String telefonePrincipal;
    private String telefoneSecundario;
    private String email;
    private String senha;
    //private TipoConta tipoConta;
    private LocalDateTime dataCadastro;
    private boolean emailValidado;
}
