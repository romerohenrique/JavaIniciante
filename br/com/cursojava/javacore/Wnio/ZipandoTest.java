package br.com.cursojava.javacore.Wnio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Zipando arquivo usando pacotees NIO e IO
 */

public class ZipandoTest {
    public static void main(String[] args) {

        Path dirZip = Paths.get("Folder3"); //Diretório destino
        Path dirFile = Paths.get("Folder2");//Diretório dos arquivos a ser zipado
        Path zipFile = dirZip.resolve("arquivo.zip");// usando o ".resolve" para mostrar o diretório destino do zip

        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()))) {
            DirectoryStream<Path> stream = Files.newDirectoryStream(dirFile);
            for (Path path : stream) {
                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zip.putNextEntry(zipEntry);
                FileInputStream fileInputStream = new FileInputStream(path.toFile());
                BufferedInputStream bf = new BufferedInputStream(fileInputStream);
                byte[] buffered = new byte[3000];
                int byteRead;
                while ((byteRead = bf.read(buffered)) > 0) {
                    zip.write(buffered, 0, byteRead);
                }
                zip.flush();
                zip.closeEntry();
                fileInputStream.close();
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Arquivo zipado com sucesso");
    }
}
