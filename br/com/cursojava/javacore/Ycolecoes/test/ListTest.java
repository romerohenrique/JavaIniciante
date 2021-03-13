package br.com.cursojava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nome = new ArrayList<>();
        List<String> nome2 = new ArrayList<>();
        nome.add("joaquim");
        nome.add("Pedro");
        nome2.add("Clemente");
        nome2.add("Marly");
        nome.addAll(nome2);
        //nome.remove(1);
//
//        for (Object name : nome) {
//            System.out.println(name);
//        }
       // int size = nome.size();

        //outra forma de percorrer o array list
        for (int i = 0 ; i < nome.size(); i++) {
            System.out.println(nome);
        }
    }
}
