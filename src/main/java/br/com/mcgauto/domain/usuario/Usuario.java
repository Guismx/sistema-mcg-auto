package br.com.mcgauto.domain.usuario;

import br.com.mcgauto.domain.usuario.enums.TipoConta;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size (min = 4, max = 70)
    private String nome;

    @NotBlank
    @Size (min = 4, max = 70)
    private String sobrenome;

    @CPF
    private String cpf;

    @NotNull
    @Past
    private LocalDate dataNascimento;

    @NotBlank
    @Email
    private String email;

    @NotNull
    private String senha;

    @Enumerated (EnumType.STRING)
    private TipoConta tipoConta;
    private String telefonePrincipal;
    private String telefoneSecundario;
    private LocalDateTime dataCadastro;
    private boolean emailValidado;

    public Usuario(){

    }

    public Usuario(long id, String nome, String sobrenome, String CPF, LocalDate dataNascimento, String telefonePrincipal, String telefoneSecundario,
                   String email, String senha, TipoConta tipoConta , LocalDateTime dataCadastro, boolean emailValidado) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefonePrincipal = telefonePrincipal;
        this.telefoneSecundario = telefoneSecundario;
        this.email = email;
        this.senha = senha;
        this.tipoConta = tipoConta;
        this.dataCadastro = dataCadastro;
        this.emailValidado = emailValidado;
    }

    public long getId() {
        return id;
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

    public @CPF String getCpf() {
        return cpf;
    }

    public void setCpf(@CPF String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
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

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
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

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", telefonePrincipal='" + telefonePrincipal + '\'' +
                ", telefoneSecundario='" + telefoneSecundario + '\'' +
                ", email='" + (email != null ? email : "não informado") + '\'' +
                ", dataCadastro=" + dataCadastro +
                ", emailValidado=" + emailValidado +
                '}';
    }
}
