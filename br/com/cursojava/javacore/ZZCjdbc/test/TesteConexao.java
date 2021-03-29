package br.com.cursojava.javacore.ZZCjdbc.test;

import br.com.cursojava.javacore.ZZCjdbc.classe.Comprador;
import br.com.cursojava.javacore.ZZCjdbc.db.CompradorDB;

public class TesteConexao {
    public static void main(String[] args) {
        Comprador comprador = new Comprador("243.987.098-00", "João");
        Comprador comprador2 = new Comprador("243.987.883-00", "Maria Joaquina de Amaral Pereira Gois");


        CompradorDB compradorDB = new CompradorDB();
        compradorDB.salvar(comprador);
        compradorDB.salvar(comprador2);
    }
}
