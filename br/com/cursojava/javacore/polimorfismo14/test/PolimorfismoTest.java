package br.com.cursojava.javacore.polimorfismo14.test;

import br.com.cursojava.javacore.polimorfismo14.classe.Funcionario;
import br.com.cursojava.javacore.polimorfismo14.classe.Gerente;
import br.com.cursojava.javacore.polimorfismo14.classe.RelatorioPagamento;
import br.com.cursojava.javacore.polimorfismo14.classe.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Thiago", 4000, 1300);
        Vendedor v = new Vendedor("Douglas", 1200, 5000);
        Vendedor v1 = new Vendedor("Regina", 1200, 12000);
        RelatorioPagamento r = new RelatorioPagamento();

        g.calcularSalario();
        System.out.println(g);
        System.out.println("_________________________");
        v.calcularSalario();
        System.out.println(v);
        v1.calcularSalario();
        System.out.println(v1);

        System.out.println("***************************");
        r.pagamentoFuncionario(g);
        r.pagamentoFuncionario(v);
        r.pagamentoFuncionario(v1);

        //passando funções de uma subclasse para uma super classe
        Funcionario f = g;
        System.out.println(f.getSalario());


    }
}
