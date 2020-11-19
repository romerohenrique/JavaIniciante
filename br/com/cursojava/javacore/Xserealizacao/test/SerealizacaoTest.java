package br.com.cursojava.javacore.Xserealizacao.test;

import br.com.cursojava.javacore.Xserealizacao.classe.Aluno;
import br.com.cursojava.javacore.Xserealizacao.classe.Turma;

import java.io.*;

public class SerealizacaoTest {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();
    }

    private static void gravadorObjeto() {
        Turma turma = new Turma("Java Puro");
        Aluno aluno = new Aluno(1L, "Jhon Travolta","112333");
        aluno.setTurma(turma);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);
            System.out.println(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorObjeto() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
