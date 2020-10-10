package br.com.cursojava.introducao.controledefluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {
        String contador1 = "Laço: For";
        String contador2 = "Laço: While";
        String contador3 = "Laço: Do While ";
        int i = 0;
        int a = 0;
        int b = 0;

        for (i = 0; i < 2; i++) {
            System.out.println(contador1);
        }

        while (a < 2) {
            System.out.println(contador2);
            a++;
        }
        do {
            System.out.println(contador3);
            b++;
        } while (b < 2);

    }
}
