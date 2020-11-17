package br.com.cursojava.javacore.Wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * NIO: BasicFileAttribute: interface de leitura
 * e BasicFileAtributeView: interface de alteração no arquivo ou diretórios
 */

public class AtributosBasicosTest {
    public static void main(String[] args) throws IOException {
        System.out.println("----------Usando File----------");

        Date cincoJaneiro = new GregorianCalendar(2019, Calendar.JANUARY, 5).getTime();
        File file = new File("Folder2\\ArquivoRenomeado2.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.setLastModified(cincoJaneiro.getTime()));
        System.out.println(file.lastModified());
        System.out.println(file.delete());

        System.out.println("----------Usando Path----------");

        Path path = Paths.get("Folder2\\Arquivo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(cincoJaneiro.getTime());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);

        //usando os atributos básicos:
        path = Paths.get("src\\br\\com\\cursojava\\javacore\\Aintroducaoclasse\\classe\\Aluno.java");
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isRegularFile(path));

        // interface leitura: BasicFileAttributes (qualquer S.O), PosixFileAttributes (S.O linux), DosFileAttributes(S.O Windows)

        BasicFileAttributes atributoBasico = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Arquivo criado: " + atributoBasico.creationTime());
        System.out.println("Ultimo acesso: " + atributoBasico.lastAccessTime());
        System.out.println("Ultima modificação: " + atributoBasico.lastModifiedTime());
        System.out.println("---------------------------------------------");
//        System.out.println("É um diretório: " + atributoBasico.isDirectory());
//        System.out.println(atributoBasico.isSymbolicLink());
//        System.out.println(atributoBasico.isRegularFile());

        // Para alterar arquivo: BasicFileAttributesView, PosixFileAttributesView, DosFileAttributesView, FileOwnerAttributeView, AclFileAttributeView

        FileTime ultimaModificacao = atributoBasico.lastModifiedTime();
        FileTime criado = atributoBasico.creationTime();
        FileTime ultimoAcesso = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicView.setTimes(ultimaModificacao, ultimoAcesso, criado);
        atributoBasico = Files.readAttributes(path, BasicFileAttributes.class);


        System.out.println("Arquivo criado: " + atributoBasico.creationTime());
        System.out.println("Ultima modificação: " + atributoBasico.lastModifiedTime());
        System.out.println("Ultimo acesso: " + atributoBasico.lastAccessTime());
    }

}
