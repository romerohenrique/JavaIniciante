package br.com.cursojava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {
    public static void main(String[] args) {
        // C:\Users\Ana Carolina\CursoJava2020\JavaTreino
        // caminho absoluto
        Path p1 = Paths.get("C:\\Users\\Ana Carolina\\CursoJava2020\\JavaTreino");
        // modificando o final por vírgula
        Path p2 = Paths.get("C:\\Users\\Ana Carolina\\CursoJava2020", "JavaTreino");
        //moficando o começo por vírgula
        Path p3 = Paths.get("C:", "Users\\Ana Carolina\\CursoJava2020\\JavaTreino");
        //alterando tudo por vírgula
        Path p4 = Paths.get("C:", "Users", "Ana Carolina", "CursoJava2020", "JavaTreino");

        // System.out.println(p1.toAbsolutePath());

        Path path1 = Paths.get("pasta", "\\subpasta", "\\arquivos");
        Path arquivo = Paths.get("pasta", "\\subpasta", "\\arquivos", "\\proj.txt");

        try {
            Files.createDirectories(path1);
            if (Files.notExists(path1)) {
                Files.createDirectories(path1.getParent());
            }
            Files.createFile(arquivo);
            if (Files.notExists(arquivo)) {
                Files.createFile(arquivo.getParent());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Copiando de um diretório e  colando em outro,
        Path arqOriginal = Paths.get("Folder\\arquivo.txt");
        Path arqCopiado = Paths.get(path1.toString() + "\\arquivo.txt");
        try {
            // renomeando arquivo e subescrevendo o mesmo arquivo.
            Files.copy(arqOriginal, arqCopiado, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
