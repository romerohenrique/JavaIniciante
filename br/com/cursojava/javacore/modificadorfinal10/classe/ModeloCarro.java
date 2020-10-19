package br.com.cursojava.javacore.modificadorfinal10.classe;

public class ModeloCarro extends Carro {

    /**
     * o método final, quando a classe filha extende, ela não pode ser modificada
     * É necesário fazer sobrecarga de método.
     */
    public void imprimir(String nome) {
        System.out.println("sobrecarga de método imprimir()");
        System.out.println(nome);
    }
}
