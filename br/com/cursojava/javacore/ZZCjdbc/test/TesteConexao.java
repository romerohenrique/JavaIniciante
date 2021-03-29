package br.com.cursojava.javacore.ZZCjdbc.test;

import br.com.cursojava.javacore.ZZCjdbc.classe.Comprador;
import br.com.cursojava.javacore.ZZCjdbc.db.CompradorDB;

import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
//        inserir();
//        deletar();
//        update();
//        List<Comprador> listaComprador = selecionarTudo();
//        System.out.println(listaComprador);
//        List<Comprador> listaComprador2 = buscarPoNome("ao");
//        System.out.println(listaComprador2);

//        CompradorDB.selectMetaData();
        CompradorDB.checkDriverStatus();
    }

    public static void inserir() {
        Comprador comprador = new Comprador("443.987.097-10", "Clarice Almeida");
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.save(comprador);

    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(4);
        CompradorDB.delete(comprador);

    }

    public static void update() {
        Comprador comprador = new Comprador(1, "243.987.098-00", "João Batista da Silva");
        comprador.setId(2);
        CompradorDB.update(comprador);

    }

    public static List<Comprador> selecionarTudo() {
        return CompradorDB.selectAll();
    }

    public static List<Comprador> buscarPoNome(String nome) {
        return CompradorDB.searchByName(nome);
    }

}
