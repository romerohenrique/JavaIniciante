package br.com.cursojava.javacore.heranca8.test;

import br.com.cursojava.javacore.heranca8.classe.Endereco;
import br.com.cursojava.javacore.heranca8.classe.Funcionario;
import br.com.cursojava.javacore.heranca8.classe.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Endereco end1 = new Endereco();
        Funcionario func = new Funcionario();

        p.setNome("Faustão");
        p.setCpf("000.223.444-44");
        end1.setRua("Rua da papuda");
        p.setEndereco(end1);
        p.imprimir();

        System.out.println("___________________________________");

        func.setNome("Diogo");
        func.setCpf("333.456.667-99");
        func.setEndereco(end1);
        func.setSalario(1456090);
        func.imprimir();


    }
}
