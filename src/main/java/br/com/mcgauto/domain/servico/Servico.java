package br.com.mcgauto.domain.servico;

import br.com.mcgauto.domain.servico.enums.TipoServico;
import br.com.mcgauto.global.enums.StatusAtivacao;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private String descricao;

    @Column (nullable = false)
    private BigDecimal preco;

    @Column (name = "tempo_servico", nullable = false)
    private int tempoServico;

    @Enumerated (EnumType.STRING)
    @Column (name = "status_servico")
    private StatusAtivacao statusServico;

    @CreationTimestamp
    @Column(name = "criado_em", nullable = false, updatable = false)
    private LocalDateTime criadoEm;

    @UpdateTimestamp
    @Column(name = "atualizado_em")
    private LocalDateTime atualizadoEm;

    public Servico() {
    }

    public Servico(TipoServico tipoServico, String nome, String descricao, BigDecimal preco, int tempoServico) {
        this.tipoServico = tipoServico;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tempoServico = tempoServico;
        this.statusServico = StatusAtivacao.ATIVO;
    }

    public long getId() {
        return id;
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
        return statusServico;
    }
    public void setStatusAtivacao(StatusAtivacao statusAtivacao) {
        this.statusServico = statusAtivacao;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", status=" + statusServico +
                '}';
    }
}
