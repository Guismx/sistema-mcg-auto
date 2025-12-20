package br.com.mcgauto.domain.veiculo;

import br.com.mcgauto.domain.usuario.Usuario;
import jakarta.persistence.*;

@Entity
@Table (name = "veiculo_cliente")
public class VeiculoCliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idVeiculo;
    private Usuario dono;
    private String marca;
    private String nome;
    private String placa;
    private String modelo;

    public VeiculoCliente() {}

    public VeiculoCliente(long idVeiculo, Usuario dono, String marca, String nome, String placa, String modelo) {
        this.idVeiculo = idVeiculo;
        this.dono = dono;
        this.marca = marca;
        this.nome = nome;
        this.placa = placa;
        this.modelo = modelo;
    }

    public long getIdVeiculo() {
        return idVeiculo;
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
                "idVeiculo=" + idVeiculo +
                ", dono=" + dono +
                ", marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
