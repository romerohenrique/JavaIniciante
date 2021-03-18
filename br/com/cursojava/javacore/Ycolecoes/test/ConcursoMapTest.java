package br.com.cursojava.javacore.Ycolecoes.test;

import br.com.cursojava.javacore.Ycolecoes.classe.Candidato;
import br.com.cursojava.javacore.Ycolecoes.classe.Nota;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcursoMapTest {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato("Jairo", 12345);
        Candidato candidato2 = new Candidato("Karla", 15345);
        Candidato candidato3 = new Candidato("Breno", 12785);

        Nota nota1 = new Nota("prv001", "Concurso PRF", 8);
        Nota nota2 = new Nota("prv002", "Concurso PRF", 9);
        Nota nota3 = new Nota("prv003", "Concurso PRF", 7);

        Map<Candidato, List<Nota>> map = new HashMap<>();
        List<Nota> notaCand1 = new ArrayList<>();
        notaCand1.add(nota1);
        List<Nota> notaCand2 = new ArrayList<>();
        notaCand2.add(nota2);
        List<Nota> notaCand3 = new ArrayList<>();
        notaCand3.add(nota3);

        map.put(candidato1, notaCand1);
        map.put(candidato2, notaCand2);
        map.put(candidato3, notaCand3);

        for (Map.Entry<Candidato, List<Nota>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Nota nota : entry.getValue()) {
                System.out.println(nota.getNome() + " " + nota.getNota());
            }
        }


    }
}
