package br.com.cursojava.javacore.Jmodificadorfinal.test;

import br.com.cursojava.javacore.Jmodificadorfinal.classe.Carro;
import br.com.cursojava.javacore.Jmodificadorfinal.classe.ModeloCarro;

public class CarroTest {
    public static void main(String[] args) {
        ModeloCarro m = new ModeloCarro("Camaro", "GM", "Amarelo");

        m.comprador.setNome("Paulo");
        System.out.println(m);
        System.out.println("Velovidade Limite: " + Carro.VELOCIDADE_FINAL);
    }
}
