package br.com.cursojava.javacore.Wnio;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

class AcharAquivoTxt extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (file.getFileName().toString().endsWith(".txt")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

}
class ImprimirDiretorios extends SimpleFileVisitor<Path> {
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("pre: " + dir);
    if (dir.getFileName().toString().equals("arquivo")){
        return FileVisitResult.CONTINUE;
    }
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        System.out.println("file: "+file.getFileName());
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult visitFileFailed(Path file, IOException exc)
            throws IOException{
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult postVisitDirectory(Path dir, IOException exc){
        System.out.println("post: "+dir);
        return FileVisitResult.CONTINUE;
    }
}
public class FileVisitorTest {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("pasta"), new ImprimirDiretorios());
    }   
}

