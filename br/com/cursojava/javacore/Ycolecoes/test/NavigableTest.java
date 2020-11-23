package br.com.cursojava.javacore.Ycolecoes.test;

import br.com.cursojava.javacore.Ycolecoes.classe.Nota;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableTest {
    public static void main(String[] args) {

        Nota nota1 = new Nota("1234", "Rogerio", 9);
        Nota nota2 = new Nota("6789", "Romero", 7);
        Nota nota3 = new Nota("5678", "Clarice", 8);
        Nota nota4 = new Nota("3346", "Ana Paula ", 10);

        NavigableSet<Nota> notaNavigableSet = new TreeSet<>();
        notaNavigableSet.add(nota1);
        notaNavigableSet.add(nota2);
        notaNavigableSet.add(nota3);
        notaNavigableSet.add(nota4);

        for (Nota n : notaNavigableSet){
            System.out.println(n);
        }
        System.out.println("--------------------");
        //tamnho do array
        System.out.println(notaNavigableSet.size());
        //Lower <
        System.out.println("Menor nota:"+notaNavigableSet.lower(nota3));
        //floor <=
        System.out.println("Menor ou igual nota: "+notaNavigableSet.floor(nota4));
        //celling >=
        System.out.println("Maior ou igual nota: "+notaNavigableSet.ceiling(nota4));
        //higher >
        System.out.println("Maior nota: "+notaNavigableSet.higher(nota2));

    }
}
