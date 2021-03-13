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

        List<Moto> motosList = new ArrayList<>();
        motosList.add(moto1);
        motosList.add(moto2);
        motosList.add(moto3);
        motosList.add(moto4);
        for (Moto moto : motosList) {
            System.out.println(moto);
        }

        //
        Moto moto5 = new Moto("Ktm", "K110", "1455");
        System.out.println(motosList.contains(moto5));
    }
}
