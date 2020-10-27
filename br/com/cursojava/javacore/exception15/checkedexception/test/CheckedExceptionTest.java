package br.com.cursojava.javacore.exception15.checkedexception.test;

import java.io.File;
import java.io.IOException;

/**
 * quando se utiliza as exceções utilizando try catch , o código continua funcionando, após o bloco.
 */

public class CheckedExceptionTest {
    public static void main(String[] args) {
        criarArquivo();

    }

    public static void criarArquivo() {
        File file = new File("Arquivo.txt");
        try {
            System.out.println("Arquivo criado ? " + file.createNewFile());
            System.out.println("arquivo criado");

            // sempre procure o tratamento da exceção de classe mais específica.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
