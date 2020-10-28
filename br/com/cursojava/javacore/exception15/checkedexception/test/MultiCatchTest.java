package br.com.cursojava.javacore.exception15.checkedexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Multi Catch a partir do java 7
 */
public class MultiCatchTest {
    public static void main(String[] args) throws IOException, SQLException {
        try {
            throw new IndexOutOfBoundsException();

            // no parâmetro pode se usar mais de uma exception separada por '|'.
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("Final do Programa");

        try {
            talvezLanceException();

            // a aprtir do java 7 posso utilizar essa forma abaixo de assinatura para as Exception laçadas.
        } catch (Exception e) {

        }
    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException, IOException {

    }
}
