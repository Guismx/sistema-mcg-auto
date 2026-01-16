package br.com.mcgauto.domain.servico;

import br.com.mcgauto.domain.produto.CategoriaProduto;
import br.com.mcgauto.domain.servico.enums.TipoServico;
import br.com.mcgauto.global.enums.StatusAtivacao;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "servicos")
public class Servico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_servico", nullable = false)
    private TipoServico tipoServico;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    @Column (name = "tempo_servico")
    private int tempoServico;
    @Enumerated (EnumType.STRING)
    @Column (name = "status_ativacao")
    private StatusAtivacao statusAtivacao;

    public Servico() {
    }

    public Servico(long id, TipoServico tipoServico, String nome, String descricao, BigDecimal preco, int tempoServico, StatusAtivacao statusAtivacao) {
        this.id = id;
        this.tipoServico = tipoServico;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tempoServico = tempoServico;
        this.statusAtivacao = statusAtivacao.ATIVO;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public StatusAtivacao getStatusAtivacao() {
        return statusAtivacao;
    }

    public void setStatusAtivacao(StatusAtivacao statusAtivacao) {
        this.statusAtivacao = statusAtivacao;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "id=" + id +
                ", tipoServico=" + tipoServico +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", tempoServico=" + tempoServico +
                ", statusAtivacao=" + statusAtivacao +
                '}';
    }
}
