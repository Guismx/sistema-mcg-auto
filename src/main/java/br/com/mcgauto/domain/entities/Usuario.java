package br.com.mcgauto.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Usuario")
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

    public Usuario(){

    }

    public Usuario(long idUsuario, String nome, String sobrenome, Date dataNascimento, String telefonePrincipal, String telefoneSecundario,
                   String email, String senha, LocalDateTime dataCadastro, boolean emailValidado) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telefonePrincipal = telefonePrincipal;
        this.telefoneSecundario = telefoneSecundario;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.emailValidado = emailValidado;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefonePrincipal() {
        return telefonePrincipal;
    }

    public void setTelefonePrincipal(String telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }

    public String getTelefoneSecundario() {
        return telefoneSecundario;
    }

    public void setTelefoneSecundario(String telefoneSecundario) {
        this.telefoneSecundario = telefoneSecundario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isEmailValidado() {
        return emailValidado;
    }

    public void setEmailValidado(boolean emailValidado) {
        this.emailValidado = emailValidado;
    }
}
