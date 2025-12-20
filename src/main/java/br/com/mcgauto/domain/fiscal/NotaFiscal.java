package br.com.mcgauto.domain.fiscal;

import br.com.mcgauto.domain.financeiro.Pagamento;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "notas_fiscais")
public class NotaFiscal {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idNota;
    private Pagamento origem;
    private TipoOrigem tipoOrigem;
    private int numeroNotaFiscal;
    private String serieNotaFiscal;
    private LocalDateTime dataEmissao;
    private String chaveAcesso;
    private String protocoloAutorizacao;
    private StatusNotaFiscal statusNotaFiscal;
    private BigDecimal valorTotal;
    private String caminhoXml;
    private String caminhoDanfe;
    private LocalDateTime dataCancelamento;
    private String motivoCancelamento;

    public NotaFiscal() {}

    public NotaFiscal(long idNota, Pagamento origem, TipoOrigem tipoOrigem, int numeroNotaFiscal, String serieNotaFiscal,
                      LocalDateTime dataEmissao, String chaveAcesso, String protocoloAutorizacao, StatusNotaFiscal statusNotaFiscal,
                      BigDecimal valorTotal, String caminhoXml, String caminhoDanfe, LocalDateTime dataCancelamento,
                      String motivoCancelamento) {
        this.idNota = idNota;
        this.origem = origem;
        this.tipoOrigem = tipoOrigem;
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.serieNotaFiscal = serieNotaFiscal;
        this.dataEmissao = dataEmissao;
        this.chaveAcesso = chaveAcesso;
        this.protocoloAutorizacao = protocoloAutorizacao;
        this.statusNotaFiscal = statusNotaFiscal;
        this.valorTotal = valorTotal;
        this.caminhoXml = caminhoXml;
        this.caminhoDanfe = caminhoDanfe;
        this.dataCancelamento = dataCancelamento;
        this.motivoCancelamento = motivoCancelamento;
    }

    public long getIdNota() {
        return idNota;
    }

    public Pagamento getOrigem() {
        return origem;
    }

    public void setOrigem(Pagamento origem) {
        this.origem = origem;
    }

    public TipoOrigem getTipoOrigem() {
        return tipoOrigem;
    }

    public void setTipoOrigem(TipoOrigem tipoOrigem) {
        this.tipoOrigem = tipoOrigem;
    }

    public int getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public String getSerieNotaFiscal() {
        return serieNotaFiscal;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public String getProtocoloAutorizacao() {
        return protocoloAutorizacao;
    }

    public void setProtocoloAutorizacao(String protocoloAutorizacao) {
        this.protocoloAutorizacao = protocoloAutorizacao;
    }

    public StatusNotaFiscal getStatusNotaFiscal() {
        return statusNotaFiscal;
    }

    public void setStatusNotaFiscal(StatusNotaFiscal statusNotaFiscal) {
        this.statusNotaFiscal = statusNotaFiscal;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
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

    public LocalDateTime getDataCancelamento() {
        return dataCancelamento;
    }

    public void setDataCancelamento(LocalDateTime dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public String getMotivoCancelamento() {
        return motivoCancelamento;
    }

    public void setMotivoCancelamento(String motivoCancelamento) {
        this.motivoCancelamento = motivoCancelamento;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "idNota=" + idNota +
                ", origem=" + origem +
                ", tipoOrigem=" + tipoOrigem +
                ", numeroNotaFiscal=" + numeroNotaFiscal +
                ", serieNotaFiscal='" + serieNotaFiscal + '\'' +
                ", dataEmissao=" + dataEmissao +
                ", chaveAcesso='" + chaveAcesso + '\'' +
                ", protocoloAutorizacao='" + protocoloAutorizacao + '\'' +
                ", statusNotaFiscal=" + statusNotaFiscal +
                ", valorTotal=" + valorTotal +
                ", caminhoXml='" + caminhoXml + '\'' +
                ", caminhoDanfe='" + caminhoDanfe + '\'' +
                ", dataCancelamento=" + dataCancelamento +
                ", motivoCancelamento='" + motivoCancelamento + '\'' +
                '}';
    }
}
