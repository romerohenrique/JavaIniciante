package br.com.cursojava.javacore.Vio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file)) {
            fw.write("Escrevendo franses\n 1 assim que pular essa linha \n pula outra");
            fw.flush();
            char[] ler = new char[300];
            int tamanho = fr.read(ler);
            System.out.println("Tamanho: " + tamanho);
            for (char rd : ler) {
                System.out.print(rd);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
