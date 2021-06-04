package br.com.cursojava.javacore.ZZDthreads.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ListaDeNomes{
    private List<String> nomes = new LinkedList<>();
    public synchronized void  add(String nome){
        nomes.add(nome);
    }
    public synchronized void removerPrimeiro(){
        if (nomes.size()>0){
            System.out.println(nomes.remove(0));
        }
    }
}
public class ThreadSafeTest {
    public static void main(String[] args) {
        ListaDeNomes nome = new ListaDeNomes();
        nome.add("Fabio");
        class RemovedorDeNome extends Thread{
            @Override
            public void run() {
                nome.removerPrimeiro();
            }
        }
        new RemovedorDeNome().start();
        new RemovedorDeNome().start();
    }
}
