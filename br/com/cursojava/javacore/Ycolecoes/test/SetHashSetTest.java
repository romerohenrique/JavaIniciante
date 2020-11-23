package br.com.cursojava.javacore.Ycolecoes.test;

import br.com.cursojava.javacore.Ycolecoes.classe.Nota;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetHashSetTest {
    public static void main(String[] args) {

        Nota nota1 = new Nota("1234", "Rogerio", 9);
        Nota nota2 = new Nota("6789", "Romero", 7);
        Nota nota3 = new Nota("5678", "Clarice", 8);
        Nota nota4 = new Nota("3346", "Ana Paula ", 10);

        //LinkedHashSet mantem a ordem de inserção de dados/ HashSet, não tem ordem, mas ambos evitam duplicar dados
        //Set<Nota> notaSet = new HashSet<>();
        Set<Nota> notaSet = new LinkedHashSet<>();
        notaSet.add(nota1);
        notaSet.add(nota2);
        notaSet.add(nota3);
        notaSet.add(nota4);
        for (Nota n : notaSet){
            System.out.println(n);
        }

    }
}
