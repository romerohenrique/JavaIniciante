package br.com.cursojava.javacore.Wnio;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class LocalizaArquivo extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{test}*.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}


public class PathMactherTest {
    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("pasta/subpasta/arquivos/proj.xlx");
        Path path2 = Paths.get("proj/projeto.xlx");
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.xlx");
        System.out.println(matcher.matches(path1));
        System.out.println(matcher.matches(path2));
        System.out.println("---------------------------------------------");
        macthes(path1, "glob:*.xlx");
        macthes(path1, "glob:**/*.xlx");
        macthes(path1, "glob:*");
        macthes(path1, "glob:**");
        System.out.println("---------------------------------------------");
        macthes(path1, "glob:**.???");
        macthes(path1, "glob:*.????");
        macthes(path1, "glob:**/*.??");
        macthes(path1, "glob:**/*.???");
        System.out.println("---------------------------------------------");
        macthes(path2, "glob:**/{proj,projeto}*");
        macthes(path1, "glob:**/{subpasta,arquivos}**/*");
        System.out.println("---------------------------------------------");
        Files.walkFileTree(Paths.get("./"), new LocalizaArquivo());

    }

    private static void macthes(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
