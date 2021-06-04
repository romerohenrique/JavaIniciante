package br.com.cursojava.javacore.ZZDthreads.classe;

public class Entregador implements Runnable {

    private ListaMembros listaMembros;

    public Entregador(ListaMembros listaMembros) {
        this.listaMembros = listaMembros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + " começando o trabalho de entrega.");
        int qtdPendente = listaMembros.getEmailsPendentes();
        boolean aberta = listaMembros.isAberta();
        while (aberta || qtdPendente > 0) {
            try {
                String email = listaMembros.obterEmailMembro();
                if (email != null) {
                    System.out.println(nomeThread + " enviando e-mail para " + email);
                    Thread.sleep(2000);
                    System.out.println("Envio para '" + email + "' concluído com sucesso.");
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            aberta = listaMembros.isAberta();
            qtdPendente = listaMembros.getEmailsPendentes();
        }
        System.out.println(" Atividades finalizadas.");

    }
}
