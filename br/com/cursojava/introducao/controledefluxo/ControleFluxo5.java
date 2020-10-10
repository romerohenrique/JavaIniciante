package br.com.cursojava.introducao.controledefluxo;

public class ControleFluxo5 {
    public static void main(String[] args) {
        /**
         * Laço for: quantidade de parcela com o valor minimo de 1000.
         * com o recurso do break. Evitando que consuma memória desnecessária.
         */
        double precoTotal = 30000;
        for (int parcela = 1; parcela <= precoTotal; parcela++) {
            double precoParcela = precoTotal / parcela;
            if (precoParcela < 1000) {
                break;
            } else {
                    System.out.println(" parcela " + parcela + " valor da parcela R$" + precoParcela);
            }
        }
    }
}
