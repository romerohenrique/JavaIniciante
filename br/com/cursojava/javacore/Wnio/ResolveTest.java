package br.com.cursojava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest {
    public static void main(String[] args) {
        Path dir = Paths.get("pasta\\subpasta\\arquivos");
        Path arquivo = Paths.get("Folder\\\\arquivo.txt");
        Path result = dir.resolve(arquivo);
        System.out.println(result);

        // tipos de resolve (arquivo, relativo e absoluto)

        Path absoluto = Paths.get("home/folder");
        Path relativo = Paths.get("subpasta");
        Path file = Paths.get("Arquivo.txt");

        System.out.println("1: " + absoluto.resolve(relativo));
        System.out.println("2: " + relativo.resolve(absoluto));
        System.out.println("3: " + absoluto.resolve(file));
        System.out.println("4: " + relativo.resolve(file));
        System.out.println("5: " + file.resolve(relativo));
        System.out.println("6: " + file.resolve(absoluto));


    }
}
