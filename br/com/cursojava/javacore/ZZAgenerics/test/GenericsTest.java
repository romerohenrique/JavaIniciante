package br.com.cursojava.javacore.ZZAgenerics.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Generics é algo que exiiste somente em tempo de
 * Type erasure
 * a partir da versão 5, o Java tem retrocompatibilidade com versões anteriores
 */
public class GenericsTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("maçã");
        lista.add("Pera");
        lista.add("ovo");

        for (String obj : lista) {
            System.out.println(obj);
        }
        add(lista, 1L);
        //em tempo de compilação lançará um erro.
        for (String obj : lista) {
            System.out.println(obj);
        }


    }
    public  static void add (List lista, Long l){
        lista.add(2);
    }
}
