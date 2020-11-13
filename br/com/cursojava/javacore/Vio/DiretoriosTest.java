package br.com.cursojava.javacore.Vio;

import java.io.File;
import java.io.IOException;

public class DiretoriosTest {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("Folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretório criado: " + mkdir);
        File file = new File(diretorio, "Arquivo.txt");
        boolean arq = file.createNewFile();
        System.out.println("Arquivo criado: " + arq);

        //  Renomeando aqruivo em um diretório específico
        File arquivoRenomeado = new File(diretorio, "ArquivoRenomeado.txt");
        boolean renomeado = file.renameTo(arquivoRenomeado);
        System.out.println("Arquivo renomeado: " + renomeado);
        // renomeando um Diretório
        File diretorioRenomeado = new File("Folder2");
        boolean dRenomeado = diretorio.renameTo(diretorioRenomeado);
        System.out.println("Diretório Renomeado: " + dRenomeado);
        buscarArquivos();
    }

    // listando os arquivos no diretório
    public static void buscarArquivos() {
        File arquivos = new File("Folder");
        String[] list = arquivos.list();
        for (String arq : list) {
            System.out.println(arq);
        }
    }
}
