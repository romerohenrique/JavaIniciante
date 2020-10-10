package br.com.cursojava.introducao.controledefluxo;

public class ControleFluxo6 {
    public static void main(String[] args) {
        /**
         * Laço for: quantidade de parcela com o valor minimo de 1000.
         * com o recurso do continue. Evitando que consuma memória desnecessária.
         */
        double precoTotal = 30000;
        for (int parcela = (int)precoTotal; parcela >=1 ; --parcela ){
            double precoParcela = precoTotal / parcela;
            if (precoParcela < 1000){
                continue;
            }else {
                System.out.println(" parcela " + parcela + " valor da parcela R$" + precoParcela);
            }
        }
    }
}
