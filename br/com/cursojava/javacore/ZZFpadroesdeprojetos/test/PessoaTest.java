package br.com.cursojava.javacore.ZZFpadroesdeprojetos.test;

import br.com.cursojava.javacore.ZZFpadroesdeprojetos.classe.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {
        Pessoa p = new Pessoa.
                PessoaBuilder("Romero")//é obrigatório quando criado dentro do cosntrutor builder
                .sobrenome("Furtado")
                .apelido("Maranhão")
                .nomeDamae("Maria Cristina")
                .criarPessoal();
        System.out.println(p);
    }
}
