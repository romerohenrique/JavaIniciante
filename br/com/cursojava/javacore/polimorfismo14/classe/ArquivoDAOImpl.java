package br.com.cursojava.javacore.polimorfismo14.classe;

public class ArquivoDAOImpl implements GenericDAO {
    @Override
    public void salvar() {
        System.out.println("Salvo no Arquivo");
    }
}
