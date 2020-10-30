package br.com.cursojava.javacore.Bintroducaometodos.test;

import br.com.cursojava.javacore.Bintroducaometodos.classe.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        e1.setNome("Joaquim");
        e1.setIdade(17);
        e1.setNotas(new double[]{5, 3, 9, 4});
        e1.imprirEstuante();
        e1.somarMedia();
        System.out.println("Aluno Aprovado ? "+e1.isAprovado());
        System.out.println("_____________________________________________");
        Estudante e2 = new Estudante();
        e2.setNome("Carlos");
        e2.setIdade(18);
        e2.setNotas(new double[]{10,8, 10});
        e2.imprirEstuante();
        e2.somarMedia();
        System.out.println("Aluno Aprovado ? "+e2.isAprovado());
    }
}
