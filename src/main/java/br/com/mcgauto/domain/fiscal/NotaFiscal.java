package br.com.mcgauto.domain.fiscal;

import br.com.mcgauto.domain.agenda.Aluguel;
import br.com.mcgauto.domain.financeiro.enums.TipoOrigem;
import br.com.mcgauto.domain.fiscal.enums.StatusNotaFiscal;
import br.com.mcgauto.domain.servico.OrdemServico;
import br.com.mcgauto.domain.venda.Venda;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "notas_fiscais")
public class NotaFiscal {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venda_id")
    private Venda venda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluguel_id")
    private Aluguel aluguel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ordem_servico_id")
    private OrdemServico ordemServico;

    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_origem")
    private TipoOrigem tipoOrigem;

    @Column (name = "numero_nota_fiscal", nullable = false)
    private int numeroNotaFiscal;

    @Column (name = "serie_nota_fiscal", length = 3)
    private String serieNotaFiscal;

    @Column (name = "data_emissao", nullable = false, updatable = false)
    private LocalDateTime dataEmissao;

    @Column (name = "chave_acesso", length = 44, unique = true)
    private String chaveAcesso;

    @Column (name = "protocolo_autorizacao")
    private String protocoloAutorizacao;

    @Enumerated (EnumType.STRING)
    @Column (name = "status_nota_fiscal", nullable = false)
    private StatusNotaFiscal statusNotaFiscal;

    @Column (name = "valor_total", nullable = false)
    private BigDecimal valorTotal;

    @Column (name = "caminho_xml")
    private String caminhoXml;

    @Column (name = "caminho_danfe")
    private String caminhoDanfe;

    @Column (name = "data_cancelamento")
    private LocalDateTime dataCancelamento;

    @Column (name = "motivo_cancelamento")
    private String motivoCancelamento;

    public NotaFiscal() {}

    //Construtor para VENDA
    public NotaFiscal(Venda venda, int numeroNotaFiscal, String serieNotaFiscal, BigDecimal valorTotal) {
        this.venda = venda;
        this.tipoOrigem = TipoOrigem.VENDA;
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.serieNotaFiscal = serieNotaFiscal;
        this.valorTotal = valorTotal;
        this.statusNotaFiscal = StatusNotaFiscal.EMITIDA;
    }

    //Construtor para SERVIÇO (OS)
    public NotaFiscal(OrdemServico ordemServico, int numeroNotaFiscal, String serieNotaFiscal, BigDecimal valorTotal) {
        this.ordemServico = ordemServico;
        this.tipoOrigem = TipoOrigem.ORDEM_SERVICO;
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.serieNotaFiscal = serieNotaFiscal;
        this.valorTotal = valorTotal;
        this.statusNotaFiscal = StatusNotaFiscal.EMITIDA;
    }

    public long getId() {
        return id;
    }

    public Venda getVenda() {
        return venda;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public TipoOrigem getTipoOrigem() {
        return tipoOrigem;
    }

    public int getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public String getSerieNotaFiscal() {
        return serieNotaFiscal;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        if (this.chaveAcesso == null) {
            this.chaveAcesso = chaveAcesso;
        }
    }

    public String getProtocoloAutorizacao() {
        return protocoloAutorizacao;
    }

    public void setProtocoloAutorizacao(String protocoloAutorizacao) {
        this.protocoloAutorizacao = protocoloAutorizacao;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public StatusNotaFiscal getStatusNotaFiscal() {
        return statusNotaFiscal;
    }

    public String getCaminhoXml() {
        return caminhoXml;
    }

    public void setCaminhoXml(String caminhoXml) {
        this.caminhoXml = caminhoXml;
    }

    public String getCaminhoDanfe() {
        return caminhoDanfe;
    }

    public void setCaminhoDanfe(String caminhoDanfe) {
        this.caminhoDanfe = caminhoDanfe;
    }

    public void cancelar(String motivo) {
        this.statusNotaFiscal = StatusNotaFiscal.CANCELADA;
        this.dataCancelamento = LocalDateTime.now();
        this.motivoCancelamento = motivo;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "id=" + id +
                ", num=" + numeroNotaFiscal +
                ", status=" + statusNotaFiscal +
                ", valor=" + valorTotal +
                '}';
    }
}
