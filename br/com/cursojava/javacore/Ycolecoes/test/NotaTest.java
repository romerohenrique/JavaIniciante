package br.com.cursojava.javacore.Ycolecoes.test;

import br.com.cursojava.javacore.Ycolecoes.classe.Nota;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * ordenando a lista com o método Collections.sort(obj);
 */
public class NotaTest {
    public static void main(String[] args) {
        List<Nota> notas = new ArrayList<>();
        Nota nota1 = new Nota("1234", "Rogerio", 8);
        Nota nota2 = new Nota("6789", "Romero", 10);
        Nota nota3 = new Nota("5678", "Clarice", 6);
        Nota nota4 = new Nota("3346", "Ana Paula ", 7);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);
        //ordenando as notas
        Collections.sort(notas);
        for (Nota nota : notas) {
            System.out.println(nota);
        }
    }
}
