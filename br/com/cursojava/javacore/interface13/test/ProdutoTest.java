package br.com.cursojava.javacore.interface13.test;

import br.com.cursojava.javacore.interface13.classe.Produto;

public class ProdutoTest {
    public static void main(String[] args) {

        Produto p = new Produto("TV Smat", 5000, 15);
        p.calcularImposto();
        p.calcularFrete();
        System.out.println(p);
    }
}
