package br.com.cursojava.javacore.exception15.checkedexception.classe;

public class Leitor2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 2 ");
    }
}
