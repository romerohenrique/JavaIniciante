package br.com.cursojava.javacore.Aintroducaoclasse.test;

import br.com.cursojava.javacore.Aintroducaoclasse.classe.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        /**
         * Princípios de POO, e coerência de Classes
         * acessando os atributos da classe pelo objeto instanciado
         */
        Pessoa pessoa = new Pessoa();
        pessoa.matricula = 1234;
        pessoa.nome = "Michael Jackson";
        pessoa.rg = "123334-5";
        pessoa.cpf = "122.345.678-90";

        System.out.println("MATRÍCULA: "+pessoa.matricula);
        System.out.println("NOME: "+pessoa.nome);
        System.out.println("RG: "+pessoa.rg);
        System.out.println("CPF: "+pessoa.cpf);


    }
}
