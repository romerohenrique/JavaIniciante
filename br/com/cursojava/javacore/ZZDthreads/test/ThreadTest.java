package br.com.cursojava.javacore.ZZDthreads.test;
/*
Ha dois tipos de threads,
Thread Daemon e User
 */

class ThreadExemplo extends Thread {
    private char c;

    public ThreadExemplo(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Thread executando: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class ThreadExemploRunnable implements Runnable {
    private char c;

    public ThreadExemploRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Thread executando: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
//        ThreadExemplo t1 = new ThreadExemplo('A');
//        ThreadExemplo t2 = new ThreadExemplo('B');
//        ThreadExemplo t3 = new ThreadExemplo('C');
//        ThreadExemplo t4 = new ThreadExemplo('D');

        Thread t1 = new Thread(new ThreadExemploRunnable('A'));
        Thread t2 = new Thread(new ThreadExemploRunnable('B'));
        Thread t3 = new Thread(new ThreadExemploRunnable('C'));
        Thread t4 = new Thread(new ThreadExemploRunnable('D'));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}