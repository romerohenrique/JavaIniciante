package br.com.cursojava.javacore.introducaoclasse.test;

import br.com.cursojava.javacore.introducaoclasse.classe.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        /**
         * Instanciando uma Classe e incializando, dentro dos conceitos de POO
         */

        Aluno aluno = new Aluno();
        aluno.nome = "Pedro Souza";
        aluno.matricula = 1234;
        aluno.idade = 17;
        System.out.println("MATRÍCULA: " + aluno.matricula);
        System.out.println("NOME: " + aluno.nome);
        System.out.println("IDADE: " + aluno.idade);

    }
}
