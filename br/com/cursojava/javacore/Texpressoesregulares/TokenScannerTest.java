package br.com.cursojava.javacore.Texpressoesregulares;

import java.util.Scanner;

public class TokenScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("cachorro, papagaio, leão, cavalo false 10 200");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        System.out.println("___________________________________________________");

        Scanner scanner2 = new Scanner("cachorro, papagaio, leão, cavalo false 10 200");
        while (scanner2.hasNext()) {
            if (scanner2.hasNextInt()) {
                int inteiro = scanner2.nextInt();
                System.out.println("Inteiro: " + inteiro);
            } else if (scanner2.hasNextBoolean()) {
                boolean boleano = scanner2.nextBoolean();
                System.out.println("Boolean: " + boleano);
            } else {
                System.out.println("String: " + scanner2.next());
            }
        }
    }
}
