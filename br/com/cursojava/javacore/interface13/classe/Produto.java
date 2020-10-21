package br.com.cursojava.javacore.interface13.classe;

public class Produto implements Tributavel, Transportavel {

    private String nome;
    private double preco;
    private double peso;
    private double precoFrete;
    private double precoFinal;


    public Produto(String nome, double preco, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", peso=" + peso +
                ", preco Frete=" + precoFrete +
                ", Preco Final com Imposto=" + precoFinal +
                '}';
    }

    @Override
    public void calcularFrete() {
        precoFrete = this.preco / this.peso * 0.1;
    }

    @Override
    public void calcularImposto() {
        precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

}
