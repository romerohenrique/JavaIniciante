package br.com.cursojava.javacore.Npolimorfismo.test;

import br.com.cursojava.javacore.Npolimorfismo.classe.Gerente;
import br.com.cursojava.javacore.Npolimorfismo.classe.RelatorioPagamento;
import br.com.cursojava.javacore.Npolimorfismo.classe.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Thiago", 4000, 1300);
        Vendedor v = new Vendedor("Douglas", 1200, 5000);
        Vendedor v1 = new Vendedor("Regina", 1200, 12000);
        RelatorioPagamento r = new RelatorioPagamento();

        r.pagamentoFuncionario(g);
        r.pagamentoFuncionario(v);
        r.pagamentoFuncionario(v1);

    }
}
