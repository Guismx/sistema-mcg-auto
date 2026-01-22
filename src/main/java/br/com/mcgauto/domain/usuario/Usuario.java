package br.com.mcgauto.domain.usuario;

import br.com.mcgauto.domain.usuario.enums.TipoConta;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private String sobrenome;

    @Column (nullable = false, unique = true, length = 14)
    private String cpf;

    @Column (nullable = false, unique = true)
    private String email;

    @Column (nullable = false)
    private String senha;

    @Column (name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_conta", nullable = false)
    private TipoConta tipoConta;

    @Column (name = "telefone_principal")
    private String telefonePrincipal;

    @Column (name = "telefone_secundario")
    private String telefoneSecundario;

    @CreationTimestamp
    @Column (name = "data_cadastro", nullable = false, updatable = false)
    private LocalDateTime dataCadastro;

    @Column (name = "email_validado")
    private boolean emailValidado;

    public Usuario(){

    }

    public Usuario(String nome, String sobrenome, String cpf, String email, String senha,
                   LocalDate dataNascimento, TipoConta tipoConta, String telefonePrincipal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.tipoConta = tipoConta;
        this.telefonePrincipal = telefonePrincipal;
        this.emailValidado = false; // Nasce não validado por segurança
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

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
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

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public boolean isEmailValidado() {
        return emailValidado;
    }
    public void setEmailValidado(boolean emailValidado) {
        this.emailValidado = emailValidado;
    }

    @Override
    public String toString() {
        // NÃO imprima a SENHA no toString (Falha de segurança grave em logs)
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", tipo=" + tipoConta +
                '}';
    }
}
