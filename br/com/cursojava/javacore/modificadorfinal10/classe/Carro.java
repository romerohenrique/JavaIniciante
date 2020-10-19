package br.com.cursojava.javacore.modificadorfinal10.classe;

public class Carro {
    private String nome;
    private String cor;
    public static final double VELOCIDADE_FINAL = 230;
    public final Comprador comprador = new Comprador();

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

    public final void imprimir() {
        System.out.println("metodo não pode ser alterado!");
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
}