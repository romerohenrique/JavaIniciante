package br.com.cursojava.javacore.modificadorfinal10.test;

import br.com.cursojava.javacore.modificadorfinal10.classe.Carro;
import br.com.cursojava.javacore.modificadorfinal10.classe.Comprador;
import br.com.cursojava.javacore.modificadorfinal10.classe.ModeloCarro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        Comprador comprador = new Comprador();
        c.setNome("Gol");
        c.setCor("preto");
        System.out.println(c.getComprador());
        c.getComprador().setNome("Joao");
        System.out.println(c.getComprador());

    }
}
