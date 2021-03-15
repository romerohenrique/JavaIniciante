package br.com.cursojava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConversaoListEArrayTest {
    public static void main(String[] args) {
        List<String> nomes1 = new ArrayList<>();
        nomes1.add("Maikon");
        nomes1.add("Priscila");
        nomes1.add("Lorena");
        nomes1.add("Jennifer");
        System.out.println("-----List p/ Array-----");
        String[] nomesArray = new String[nomes1.size()];
        nomes1.toArray(nomesArray);
        System.out.println(nomes1);
        System.out.println(Arrays.toString(nomesArray));

        System.out.println("-----Array p/ Lista-----");

        String[] nomesArray2 = new String[4];
        nomesArray2[0] = "Michele";
        nomesArray2[1] = "Pedro";
        nomesArray2[2] = "Rambo";
        nomesArray2[3] = "Bruna";
        List<String> nomes2 = new ArrayList<>();
        nomes2.addAll(Arrays.asList(nomesArray2));
        System.out.println(Arrays.toString(nomesArray2));
        // adicionando nome à lista sem alterar a origem da cópia
        System.out.println(nomes2);
        nomes2.add(1, "nono");
        System.out.println("Incuído mais um nome: " + nomes2);


    }
}
