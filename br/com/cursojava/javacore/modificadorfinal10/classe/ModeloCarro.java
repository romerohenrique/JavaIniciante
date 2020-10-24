package br.com.cursojava.javacore.modificadorfinal10.classe;

/**
 * o método final, quando a classe filha extende, ela não pode ser modificada
 * É necesário fazer sobrecarga de método.
 */

public class ModeloCarro extends Carro {

    public ModeloCarro(String nome, String marca, String cor) {
        super(nome, marca, cor);
    }
}
