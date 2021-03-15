package br.com.cursojava.javacore.Ycolecoes.test;

import br.com.cursojava.javacore.Ycolecoes.classe.Moto;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * removendo elementos da lista com Iterator
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<Moto> moto = new LinkedList<>();
        Moto moto1 = new Moto("ducati", "r350", "123998", 0);
        Moto moto2 = new Moto("ducati", "rs1000", "123999",12);
        Moto moto3 = new Moto("yamaha", "xt660", "6789",1);
        Moto moto4 = new Moto("suzuki", "gts750", "453280",2);
        moto.add(moto1);
        moto.add(moto2);
        moto.add(moto3);
        moto.add(moto4);
        Iterator<Moto> motoIterator = moto.iterator();
        //hasNext() e next()
        while (motoIterator.hasNext()) {
            if (motoIterator.next().getQtd() == 0) {
                motoIterator.remove();
            }
        }
        System.out.println("Qantidade removida: "+moto.size());
        System.out.println("Lista atualizada");
        for(Moto m : moto){
               System.out.println(m);
        }

    }
}
