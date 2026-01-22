package br.com.mcgauto.domain.usuario;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "cnhs")
public class Cnh {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "usuario_id", nullable = false)
    private Usuario titular;

    @Column (name = "numero_cnh", nullable = false, unique = true, length = 11)
    private String numeroCnh;

    @Column (nullable = false)
    private LocalDate validade;

    @Column(length = 2)
    private String categoria;

    public Cnh(){
    }

    public Cnh(Usuario titular, String numeroCnh, LocalDate validade, String categoria) {
        this.titular = titular;
        this.numeroCnh = numeroCnh;
        this.validade = validade;
        this.categoria = categoria;
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

    public String getNumeroCnh() {
        return numeroCnh;
    }
    public void setNumeroCnh(String numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public LocalDate getValidade() {
        return validade;
    }
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
