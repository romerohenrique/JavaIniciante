package br.com.cursojava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizarTest {
    public static void main(String[] args) {
        Path dir = Paths.get("Home/GrupoA/Classe");
        Path pasta = Paths.get("Classe/Alunos.xlx");
        Path relativizar = dir.relativize(pasta);
        System.out.println(relativizar);

        Path absoluto1 = Paths.get("urser/job/weekJob");
        Path absoluto2 = Paths.get("job/weekJob/clientes.xlx");
        Path absoluto3 = Paths.get("Work/planilha.xlx");
        Path relativo1 = Paths.get("local/documents");
        Path relativo2 = Paths.get("temp");

        System.out.println("1: " + absoluto1.relativize(absoluto2));
        System.out.println("2: " + absoluto2.relativize(absoluto3));
        System.out.println("3: " + absoluto3.relativize(absoluto1));
        System.out.println("4: " + relativo1.relativize(absoluto2));
        System.out.println("5: " + relativo2.relativize(absoluto1));
        System.out.println("6: " + relativo1.relativize(relativo2));

    }
}
