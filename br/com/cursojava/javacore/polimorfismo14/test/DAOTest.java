package br.com.cursojava.javacore.polimorfismo14.test;

import br.com.cursojava.javacore.polimorfismo14.classe.ArquivoDAOImpl;
import br.com.cursojava.javacore.polimorfismo14.classe.BancoDadosDAOImpl;
import br.com.cursojava.javacore.polimorfismo14.classe.GenericDAO;

/**
 * Polimorfismo em Interfaces
 */

public class DAOTest {
    public static void main(String[] args) {
        //O Objeto  e a variavel podem ser alterados, porém o tipo do objeto não "GenericDAO".
        GenericDAO bd = new ArquivoDAOImpl();
        bd.salvar();
        //2º forma
        GenericDAO arq = new BancoDadosDAOImpl();
        arq.salvar();
    }
}
