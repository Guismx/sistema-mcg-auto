package br.com.mcgauto.domain.usuario;


import br.com.mcgauto.domain.usuario.enums.TipoEndereco;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "enderecos")
public class Endereco {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "usuario_id", nullable = false)
    private Usuario proprietario;

    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_endereco", nullable = false)
    private TipoEndereco tipoEndereco;

    @Column (nullable = false, length = 9)
    private String cep;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false, length = 10)
    private String numero;

    private String complemento;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false, length = 2)
    private String uf;

    @CreationTimestamp
    @Column(name = "criado_em", updatable = false)
    private LocalDateTime criadoEm;

    @UpdateTimestamp
    @Column(name = "atualizado_em")
    private LocalDateTime atualizadoEm;

    private boolean ativo;

    public Endereco(){
    }

    public Endereco(Usuario proprietario, TipoEndereco tipoEndereco, String cep, String logradouro,
                    String numero, String bairro, String cidade, String uf) {
        this.proprietario = proprietario;
        this.tipoEndereco = tipoEndereco;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.ativo = true;
    }

    public long getId() {
        return id;
    }

    public Usuario getProprietario() {
        return proprietario;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }
    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", tipo=" + tipoEndereco +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '/' + uf + '\'' +
                '}';
    }
}
