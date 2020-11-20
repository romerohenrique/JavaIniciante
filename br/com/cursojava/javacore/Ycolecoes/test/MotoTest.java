package br.com.cursojava.javacore.Ycolecoes.test;

import br.com.cursojava.javacore.Ycolecoes.classe.Moto;

import java.util.ArrayList;
import java.util.List;

public class MotoTest {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Kavasaki", "K1100", "123455");
        Moto moto2 = new Moto("KTM", "F300", "127547");
        Moto moto3 = new Moto("Triumph", "Tiger 800", "98763");
        Moto moto4 = new Moto("Honda", "cbr 1100", "896745");

        List<Moto> motos = new ArrayList<>();
        motos.add(moto1);
        motos.add(moto2);
        motos.add(moto3);
        motos.add(moto4);
        for (Moto moto : motos) {
            System.out.println(moto);
        }

        //
        Moto moto5 = new Moto("Kavasaki", "K1100", "123455");
        System.out.println(motos.contains(moto5));
    }
}
