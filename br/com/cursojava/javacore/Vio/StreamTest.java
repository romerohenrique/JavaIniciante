package br.com.cursojava.javacore.Vio;

import java.io.*;

public class StreamTest {

    public static void main(String[] args) {
        fastLeitor();
    }

    private static void escrever() {
        byte[] dados = {12, 13, 14, 15, 16};
        try (FileOutputStream escrita = new FileOutputStream("pasta/Escrita.txt")) {
            escrita.write(dados);
            System.out.println("Dados gravados com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ler() {

        try (FileInputStream leitura = new FileInputStream("pasta/Escrita.txt")) {
            int leitor;
            while ((leitor = leitura.read()) != -1) {
                byte l = (byte) leitor;
                System.out.print(" " + l);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fastEscrita() {
        byte[] dados = {106, 97, 118, 97};
        try (BufferedOutputStream escrita = new BufferedOutputStream(new FileOutputStream("pasta/Escrita.txt"))) {
            escrita.write(dados);
            System.out.println("Dados gravados com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fastLeitor() {
        try (BufferedInputStream leitura = new BufferedInputStream(new FileInputStream("pasta/Escrita.txt"))) {
            int leitor;
            while ((leitor = leitura.read()) != -1) {
                byte l = (byte) leitor;
                System.out.print(" " + l);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
