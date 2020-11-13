package br.com.cursojava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {
    public static void main(String[] args) {
        // C:\Users\Ana Carolina\CursoJava2020\JavaTreino
        // caminho absoluto
        Path p1 = Paths.get("C:\\Users\\Ana Carolina\\CursoJava2020\\JavaTreino");
        // modificando o final
        Path p2 = Paths.get("C:\\Users\\Ana Carolina\\CursoJava2020", "JavaTreino");
        //moficando o começo
        Path p3 = Paths.get("C:", "Users\\Ana Carolina\\CursoJava2020\\JavaTreino");
        //alterando o caminho todo
        Path p4 = Paths.get("C:", "Users", "Ana Carolina", "CursoJava2020", "JavaTreino");


    }
}
