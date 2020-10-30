package br.com.cursojava.javacore.Jmodificadorfinal.classe;

public class Carro {
    private String nome;
    private String marca;
    private String cor;
    public static final double VELOCIDADE_FINAL = 230;
    public final Comprador comprador = new Comprador();


    public Carro(String nome, String marca, String cor) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", comprador =" + comprador +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}