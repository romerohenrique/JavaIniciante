package br.com.cursojava.introducao.controledefluxo;

import static java.lang.System.*;

public class ControleFluxo4 {
    public static void main(String[] args) {
        /**
         * contado de 0 100 para mostrar os números pares.
         */
        int i;
        int numb;

        for (i = 0; i <= 100; i++) {
            numb = i;
            if (numb % 2 == 0) {
                System.out.println("números pares de 0 á 100: " + numb);

            }
        }
    }
}
