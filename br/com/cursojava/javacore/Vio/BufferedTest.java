package br.com.cursojava.javacore.Vio;

import java.io.*;

/**
 * BufferedWriter e BufferedReader tem uma performace melhor
 * do que FileReader e FileWriter, porém faz a mesma coisa.
 */

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))) {
            bw.write("Jogos de verão sempre são bons na praia.");
            bw.newLine();
            bw.write("Então curta e viva o verão.");
            bw.flush();
            String ler;
            while ((ler = br.readLine()) != null) {
                System.out.println(ler);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
