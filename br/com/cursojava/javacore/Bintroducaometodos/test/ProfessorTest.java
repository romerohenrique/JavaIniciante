package br.com.cursojava.javacore.Bintroducaometodos.test;

import br.com.cursojava.javacore.Bintroducaometodos.classe.Professor;
import br.com.cursojava.javacore.Bintroducaometodos.classe.Professor2;

public class ProfessorTest {
    public static void main(String[] args) {
        /**
         * O Objeto Tipo Professor: executa o método de variável de referência do tipo Profressor
         * O Objeto Tipo Professor2: executa o método utilizando o '.this', posicionando diretamente a variável
         * do Objeto.
         */
        Professor prof1 = new Professor();
        prof1.matricula = "p1234";
        prof1.nome = "Joao Miguel";
        prof1.rg = "12345567-9";
        prof1.cpf = "111.234.456-12";

        Professor2 prof2 = new Professor2();
        prof2.matricula = "p34234";
        prof2.nome = "Francisco Santos";
        prof2.rg = "13467-4";
        prof2.cpf = "345.554.566-52";

        prof1.imprimir(prof1);
        System.out.println("---------------------------------");
        prof2.imprimir();
    }
}
