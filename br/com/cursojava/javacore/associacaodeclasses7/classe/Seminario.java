package br.com.cursojava.javacore.associacaodeclasses7.classe;
/**
 * Associação de Classes: Sistema de gerenciamento de seminários
 * Seminario; Local; Professor; Aluno;
 * um aluno só poderá estar em um seminário;
 * um seminario poderá ter nenhum ou vários alunos;
 * um professor poderá ministrar um ou vários seminários;
 * um seminário só poderá ter um professor;
 * um seminário só poderá ter um local
 */

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void imprimir() {
        System.out.println("------------Relatório do Seminário------------");
        if (this.titulo != null) {
            System.out.println("Título: " + this.titulo);
        } else {
            System.out.println("Nome de Seminário não registrado");
        }
        if (local != null) {
            System.out.println("Local, " + this.local.getRua() + ", Bairro " + this.local.getBairro());
        } else {
            System.out.println("Local nao registrado");
        }
        if (professor != null) {
            System.out.println("Professor: " + this.professor.getNome());
        } else {
            System.out.println("Professor não registrado");
        }
        if (alunos != null) {
            System.out.println("-----------Alunos Participantes-----------");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        } else {
            System.out.println("Alunos não registrados");
        }


    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
