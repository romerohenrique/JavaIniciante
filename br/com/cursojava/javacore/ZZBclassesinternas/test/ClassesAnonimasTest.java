package br.com.cursojava.javacore.ZZBclassesinternas.test;

import br.com.cursojava.javacore.Ycolecoes.classe.Moto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal {
    public void andar() {
        System.out.println("Andando");
    }
}

public class ClassesAnonimasTest {
    public static void main(String[] args) {
        //Classe anôninma
        Animal a = new Animal() {
            @Override
            public void andar() {
                System.out.println("Andado mais rápido");
            }
        };
        a.andar();

        List<Moto> motoList = new ArrayList<>();
        motoList.add(new Moto("honda","crf 400"));
        motoList.add(new Moto("Triumph","Tiger 800"));
        Collections.sort(motoList, new Comparator<Moto>() {
            @Override
            public int compare(Moto o1, Moto o2) {
                return o1.getModelo().compareTo(o2.getModelo());
            }
        });
        System.out.println(motoList);

    }
}
