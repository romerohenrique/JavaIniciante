package br.com.cursojava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Organiza o Path de formA MAIS SIMPLES.
 * ex.: de ""..\\..\\" e ".\.\" para "diretorio\ diretorio\diretorio".
 */
public class NormalizacaoTest {
    public static void main(String[] args) {
        String diretorioOrigem = "CursoJava2020\\JavaTreino\\pasta";
        String arquivoTxt = "..\\..\\aquivo.txt";
        Path ph1 = Paths.get(diretorioOrigem, arquivoTxt);
        System.out.println(ph1);
        System.out.println(ph1.normalize());
        // não significa que vá criar um  caminho absoluto, mas sim simplicar
        Path ph2 = Paths.get(diretorioOrigem, arquivoTxt);
        System.out.println("ac/./d/./a");
        System.out.println(ph2);
        System.out.println(ph2.normalize());


    }
}
