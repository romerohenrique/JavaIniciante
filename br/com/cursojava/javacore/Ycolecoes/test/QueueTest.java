package br.com.cursojava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        // PriorityQueue = fila de prioridade(o primeiro da fila é o primeiro que sai)
        Queue<String> queue = new PriorityQueue<>();
        queue.add("A");
        queue.add("C");
        queue.add("D");
        queue.add("B");

        System.out.println(queue);
        //peek = mostra o primeiro da lista
        System.out.println(queue.peek());
        //poll = mostra e retira o primeiro da lista
        System.out.println(queue.poll());
        //remove = remove o primeiro da lista
        System.out.println(queue.remove());
        System.out.println(queue.size());

    }
}
