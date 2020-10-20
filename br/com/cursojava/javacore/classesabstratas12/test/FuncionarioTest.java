package br.com.cursojava.javacore.classesabstratas12.test;

import br.com.cursojava.javacore.classesabstratas12.classe.Gerente;
import br.com.cursojava.javacore.classesabstratas12.classe.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Rômulo", "111.222.111-11", 12000);
        Vendedor v = new Vendedor("Carlos", "267.987.008-22", 900, 10000);

        System.out.println(g);
        g.calcularSalario();

        System.out.println("____________________");

        System.out.println(v);
        v.calcularSalario();

    }
}
