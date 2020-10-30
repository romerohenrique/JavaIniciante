package br.com.cursojava.javacore.exception15.checkedexception.test;

import br.com.cursojava.javacore.exception15.checkedexception.classe.Leitor2;
import br.com.cursojava.javacore.exception15.checkedexception.classe.Leitor1;

public class TryWithResourceTest {
    public static void main(String[] args) {

        lerArquivo();
    }

    /**
     * Try with resource
     * implementando o metodo da interface Autocloseable
     *
     */

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}