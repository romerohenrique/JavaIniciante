package br.com.cursojava.javacore.introducaometodos.test;

import br.com.cursojava.javacore.introducaoclasse.classe.Aluno;
import br.com.cursojava.javacore.introducaometodos.classe.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        e1.nome = "Joaquim";
        e1.idade = 14;
        e1.notas = new double[]{5, 3, 9, 4};
        e1.imprirEstuante();
        e1.somarMedia();
        System.out.println("_____________________________________________");
        Estudante e2 = new Estudante();
        e2.nome = "Carlos";
        e2.idade = 18;
        e2.notas = new double[]{10,8, 10};
        e2.imprirEstuante();
        e2.somarMedia();
    }
}
