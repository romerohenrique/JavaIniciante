package br.com.cursojava.javacore.polimorfismo14.classe;

public class BancoDadosDAOImpl implements GenericDAO {
    @Override
    public void salvar() {
        System.out.println("Salvo no Banco de Dados");
    }
}
