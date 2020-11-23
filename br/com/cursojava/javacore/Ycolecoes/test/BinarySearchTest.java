package br.com.cursojava.javacore.Ycolecoes.test;

import br.com.cursojava.javacore.Ycolecoes.classe.Nota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(4);
        number.add(5);
        number.add(3);
        number.add(8);
        Collections.sort(number);
        System.out.println(Collections.binarySearch(number, 2));

        List<Nota> notas = new ArrayList<>();
        Nota nota1 = new Nota("1234", "Rogerio", 9);
        Nota nota2 = new Nota("6789", "Romero", 7);
        Nota nota3 = new Nota("5678", "Clarice", 8);
        Nota nota4 = new Nota("3346", "Ana Paula ", 10);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);

        Collections.sort(notas, new NotaNomeComparator());
        Nota nota5 = new Nota("899", "Henrique", 5);
        for (Nota nota : notas) {
            System.out.println(nota);
        }
        System.out.println(Collections.binarySearch(notas, nota5, new NotaNomeComparator()));
        Integer[] arrayInterger = new Integer[4];
        arrayInterger[0] = 10;
        arrayInterger[1] = 0;
        arrayInterger[2] = 1;
        arrayInterger[3] = 2;
        System.out.println("----------------------");
        Arrays.sort(arrayInterger);
        for (Integer i : arrayInterger) {
            System.out.println(i);
        }
        System.out.println("----------------------");
        System.out.println(Arrays.binarySearch(arrayInterger, 4));
    }
}
