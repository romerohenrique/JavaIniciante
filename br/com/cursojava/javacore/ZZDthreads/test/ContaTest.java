package br.com.cursojava.javacore.ZZDthreads.test;

import br.com.cursojava.javacore.ZZDthreads.classe.Conta;

public class ContaTest implements Runnable {
    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        Thread romero = new Thread(contaTest, "Romero");
        Thread anna = new Thread(contaTest, "Anna");

        anna.start();
        romero.start();
    }

    // o método synchronized pode ser utlizados em métodos ou blocos, ele executa uma thread por vez.
    private synchronized void saque(int valor) {
        if (conta.getSaldo() >= valor) {
            System.out.println(Thread.currentThread().getName() + " sacando o dinheiro...");
            conta.saque(valor);
            System.out.println(Thread.currentThread().getName() + " saque finalizado. Saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saldo indisponível para " + Thread.currentThread().getName() + " efetuar o saque, saldo: " + conta.getSaldo());
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("deu ruim, sem grana.");
            }
        }
    }
}
