package br.com.cursojava.javacore.Npolimorfismo.classe;

public class BancoDadosDAOImpl implements GenericDAO {
    @Override
    public void salvar() {
        System.out.println("Salvo no Banco de Dados");
    }
}
