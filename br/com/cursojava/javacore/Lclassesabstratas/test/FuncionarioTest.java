package br.com.cursojava.javacore.Lclassesabstratas.test;

import br.com.cursojava.javacore.Lclassesabstratas.classe.Gerente;
import br.com.cursojava.javacore.Lclassesabstratas.classe.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Rômulo", "111.222.111-11", 12000);
        Vendedor v = new Vendedor("Carlos", "267.987.008-22", 900, 8000);

        g.calcularSalario();
        System.out.println(g);

        System.out.println("____________________");

        v.calcularSalario();
        System.out.println(v);

    }
}
