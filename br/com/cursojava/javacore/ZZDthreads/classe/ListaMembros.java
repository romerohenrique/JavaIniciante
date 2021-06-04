package br.com.cursojava.javacore.ZZDthreads.classe;

import java.util.LinkedList;
import java.util.Queue;

public class ListaMembros {
    private final Queue<String> emails = new LinkedList<>();
    private boolean aberta = true;

    public int getEmailsPendentes() {
        synchronized (emails) {
            return this.emails.size();
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public String obterEmailMembro() {
        String email = null;
        try {
            synchronized (this.emails) {
                while (this.emails.size() == 0) {
                    if (!aberta) return null;
                    System.out.println("Lista vazia, colocando a Thread: " + Thread.currentThread().getName() + ", em modo wait.");
                    this.emails.wait();
                }
                email = this.emails.poll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return email;
    }

    public void adicionarEmail(String email) {
        synchronized (this.emails) {
            this.emails.add(email);
            System.out.println("Email adicionado a lista");
            System.out.println("Notificando as threads que estão em espera");
            this.emails.notifyAll();
        }
    }

    public void fecharLista() {
        System.out.println("Notificando todas as threads e fechando a lista.");
        aberta = false;
        synchronized (this.emails) {
            this.emails.notifyAll();
        }
    }
}
