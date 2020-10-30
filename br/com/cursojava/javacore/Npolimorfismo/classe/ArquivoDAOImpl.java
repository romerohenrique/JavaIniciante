package br.com.cursojava.javacore.Npolimorfismo.classe;

public class ArquivoDAOImpl implements GenericDAO {
    @Override
    public void salvar() {
        System.out.println("Salvo no Arquivo");
    }
}
