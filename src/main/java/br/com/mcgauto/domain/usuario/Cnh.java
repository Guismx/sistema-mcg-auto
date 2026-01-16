package br.com.mcgauto.domain.usuario;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

@Entity
@Table (name = "habilitacao_cliente")
public class Cnh {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn (name = "usuario_id", nullable = false)
    private Usuario titular;
    @Column (name = "numero_cnh", nullable = false)
    private int numeroCnh;
    private LocalDate validade;

    public Cnh(){

    }

    public Cnh(long id, Usuario titular, int numeroCnh, LocalDate validade) {
        this.id = id;
        this.titular = titular;
        this.numeroCnh = numeroCnh;
        this.validade = validade;
    }

    public long getId() {
        return id;
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
                "id=" + id +
                ", titular=" + (titular != null ? titular.getNome() : null) +
                ", numeroCnh=" + numeroCnh +
                ", validade=" + validade +
                '}';
    }
}
