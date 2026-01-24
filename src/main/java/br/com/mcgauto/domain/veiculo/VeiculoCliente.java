package br.com.mcgauto.domain.veiculo;

import br.com.mcgauto.domain.usuario.Usuario;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table (name = "veiculo_cliente")
public class VeiculoCliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "usuario_id", nullable = false)
    private Usuario dono;

    @Column (nullable = false, length = 50)
    private String marca;

    @Column (nullable = false, length = 50)
    private String nome;

    @Column (nullable = false, unique = true, length = 7)
    private String placa;

    @Column (length = 50, nullable = false)
    private String modelo;

    @CreationTimestamp
    @Column(name = "criado_em", nullable = false, updatable = false)
    private LocalDateTime criadoEm;

    @UpdateTimestamp
    @Column(name = "atualizado_em")
    private LocalDateTime atualizadoEm;

    public VeiculoCliente() {}

    public VeiculoCliente(Usuario dono, String marca, String nome, String placa, String modelo) {
        this.dono = dono;
        this.marca = marca;
        this.nome = nome;
        this.placa = placa;
        this.modelo = modelo;
    }

    public long getId() {
        return id;
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    @Override
    public String toString() {
        return "VeiculoCliente{" +
                "id=" + id +
                ", dono=" + (dono != null ? dono.getNome() : "null") +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
