package br.com.cursojava.javacore.RString;

/**
 * Performace com String, StringBuilder e StringBuffer.
 * em relação quantidade de string X tempo.
 */

public class StringPerformaceTest {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo usando String: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo usando StringBuffer: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo usando StringBuilder: " + (fim - inicio) + " ms");


    }

    private static void concatString(int tamanho) {
        String string = "";
        for (int i = 0; i < tamanho; i++) {
            string += i;
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf = sbf.append(i);
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb = sb.append(i);
        }
    }
}
