package br.com.cursojava.javacore.Texpressoesregulares;

/**
 * Token e Delimitadores com String
 */
public class TokenTest {
    public static void main(String[] args) {
        String str = "cachorro, papagaio, leão, cavalo";
        String[] tokens = str.split(",");
        for (String token : tokens) {
            System.out.println(token.trim());
        }
    }
}
