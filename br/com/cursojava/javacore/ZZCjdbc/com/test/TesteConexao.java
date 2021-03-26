package br.com.cursojava.javacore.ZZCjdbc.com.test;

import br.com.cursojava.javacore.ZZCjdbc.com.ConexaoFactory;

public class TesteConexao {
    public static void main(String[] args) {
        ConexaoFactory con = new ConexaoFactory();
        con.getConexao();
    }
}
