package br.com.cursojava.javacore.Vio;

import sun.util.resources.LocaleData;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");

        try {
            System.out.println(file.createNewFile());
            boolean exist = file.exists();
            System.out.println("PErmssão de leitura? " + file.canRead());
            System.out.println("Path: " + file.getPath());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("É um diretório? " + file.isDirectory());
            System.out.println("É um arquivo oculto? " + file.isHidden());
            System.out.println("o arquivo existe? " + file.exists());
            System.out.println("Ultima modificação: " +new Date(file.lastModified()));
            if (exist) {
                System.out.println("o arquivo foi deletado? " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
