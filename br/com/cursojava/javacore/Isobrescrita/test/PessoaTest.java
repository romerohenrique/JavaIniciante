package br.com.cursojava.javacore.Isobrescrita.test;
import br.com.cursojava.javacore.Isobrescrita.classe.Pessoa;


public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p =new Pessoa();
        Pessoa p2 = new Pessoa();


        p.setNome("Teixeira Neto");
        p.setIdade(44);
        System.out.println(p);

        p2.setIdade(33);
        p2.setNome("Jeniffer");
        System.out.println(p2);





    }
}
