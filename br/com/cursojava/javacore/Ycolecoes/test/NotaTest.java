package br.com.cursojava.javacore.Ycolecoes.test;


import br.com.cursojava.javacore.Ycolecoes.classe.Nota;

import java.util.*;

/**
 * ordenando a lista com o método Collections.sort(obj);
 * ordenando a lista com o método Arrays.sort(obj);
 * Usanso a Classe Comparator
 */
class NotaNomeComparator implements Comparator<Nota> {

    @Override
    public int compare(Nota o1, Nota o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class NotaTest {
    public static void main(String[] args) {
        List<Nota> notas = new ArrayList<>();
        Nota[] nota = new Nota[4];

        Nota nota1 = new Nota("1234", "Rogerio", 9);
        Nota nota2 = new Nota("6789", "Romero", 7);
        Nota nota3 = new Nota("5678", "Clarice", 8);
        Nota nota4 = new Nota("3346", "Ana Paula ", 10);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);

        // criando array de nota e passando o objeto nas posições predefinidas
        nota[0] = nota1;
        nota[1] = nota2;
        nota[2] = nota3;
        nota[3] = nota4;
        //ordenando as notas e ordenando pelo nome usando a interface Comparator
        Collections.sort(notas, new NotaNomeComparator());
//        for (Nota nota : notas) {
//            System.out.println(nota);
//        }
        //ordenando, usando a Classe Arrays para usar o método .sort
        Arrays.sort(nota, new NotaNomeComparator());
        for (Nota n : nota) {
            System.out.println(n);
        }
    }
}
