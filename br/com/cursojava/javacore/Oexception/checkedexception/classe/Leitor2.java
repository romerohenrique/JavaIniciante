package br.com.cursojava.javacore.Oexception.checkedexception.classe;

public class Leitor2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 2 ");
    }
}
