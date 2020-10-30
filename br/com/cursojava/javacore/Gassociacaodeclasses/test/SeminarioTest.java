package br.com.cursojava.javacore.Gassociacaodeclasses.test;

import br.com.cursojava.javacore.Gassociacaodeclasses.classe.Aluno;
import br.com.cursojava.javacore.Gassociacaodeclasses.classe.Local;
import br.com.cursojava.javacore.Gassociacaodeclasses.classe.Professor;
import br.com.cursojava.javacore.Gassociacaodeclasses.classe.Seminario;

/**
 * Associação de Classes: Sistema de gerenciamento de seminários
 * Seminario; Local; Professor; Aluno;
 * um aluno só poderá estar em um seminário;
 * um seminario poderá ter nenhum ou vários alunos;
 * um professor poderá ministrar um ou vários seminários;
 * um seminário só poderá ter um professor;
 * um seminário só poderá ter um local
 */

public class SeminarioTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Romero", 33);
        Aluno aluno2 = new Aluno("Viviam", 22);
        Aluno aluno3 = new Aluno("Arnon", 40);

        Seminario sem = new Seminario("Como ser o melhor DEV do mundo");
        Professor prof = new Professor("Joaquim ", "Mestre em Aquitetura de Software");
        Local local = new Local("Rua das Mangabeiras", "Floresta");

        aluno1.setSeminario(sem);
        aluno2.setSeminario(sem);
        aluno3.setSeminario(sem);

        sem.setLocal(local);
        sem.setProfessor(prof);
        sem.setAlunos(new Aluno[]{aluno1, aluno2, aluno3});

        prof.setSeminario(new Seminario[]{sem});

        sem.imprimir();
        prof.imprimir();

    }
}
