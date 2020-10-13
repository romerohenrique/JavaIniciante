package br.com.cursojava.javacore.sobrecargaconstrutores.test;

import br.com.cursojava.javacore.sobrecargaconstrutores.classe.Aluno;

/**
 * sobrecarga de construtores
 * obrigatoriamente terá que inicializar as variáveis do construtor (objeto);
 * Em tempo de execução o compilador iniciará com o construtor adequado com o tipo de valores inseridos no parâmetro.
 * exemplo ao debaixo.
 */
public class AlunoTest {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("al123", "Carlos Alberto", new double[]{7.5, 8, 9}, "111.222.333-44");
        aluno.imprimir();
        System.out.println("_______________________________________________");
        // usandando outro construtor
        Aluno aluno1 = new Aluno("al12345", "Gustavo Limma", new double[]{4, 9, 8});
        aluno1.imprimir();
    }
}
