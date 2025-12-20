package br.com.mcgauto.domain.usuario;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "habilitacao_cliente")
public class Cnh {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idCnh;
    private Usuario titular;
    private int numeroCnh;
    private LocalDate validade;

    public Cnh(){}

    public Cnh(long idCnh, Usuario titular, int numeroCnh, LocalDate validade) {
        this.idCnh = idCnh;
        this.titular = titular;
        this.numeroCnh = numeroCnh;
        this.validade = validade;
    }

    public long getIdCnh() {
        return idCnh;
    }

    public Usuario getTitular() {
        return titular;
    }

    public void setTitular(Usuario titular) {
        this.titular = titular;
    }

    public int getNumeroCnh() {
        return numeroCnh;
    }

    public void setNumeroCnh(int numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Cnh{" +
                "idCnh=" + idCnh +
                ", titular=" + titular +
                ", numeroCnh=" + numeroCnh +
                ", validade=" + validade +
                '}';
    }
}
