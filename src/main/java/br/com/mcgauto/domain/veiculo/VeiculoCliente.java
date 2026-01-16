package br.com.mcgauto.domain.veiculo;

import br.com.mcgauto.domain.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name = "veiculo_cliente")
public class VeiculoCliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "usuario_id")
    private Usuario dono;
    @Column (length = 50, nullable = false)
    private String marca;
    @Column (length = 50, nullable = false)
    private String nome;
    @Column (length = 7, nullable = false, unique = true)
    private String placa;
    @Column (length = 50, nullable = false)
    private String modelo;

    public VeiculoCliente() {}

    public VeiculoCliente(long id, Usuario dono, String marca, String nome, String placa, String modelo) {
        this.id = id;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "VeiculoCliente{" +
                "id=" + id +
                ", dono=" + (dono != null ? dono.getNome() : null) +
                ", marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
