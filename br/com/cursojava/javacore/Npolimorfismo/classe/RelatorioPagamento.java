package br.com.cursojava.javacore.Npolimorfismo.classe;

public class RelatorioPagamento {

    //Parâmetros polimórficos
    public void pagamentoFuncionario(Funcionario funcionario) {
        System.out.println("Relatório de pagamento de Funcionário");
        funcionario.calcularSalario();
        System.out.println("Nome:" + funcionario.getNome());
        System.out.println("Salário:" + funcionario.getSalario());

        //instanceof : testa se a variável de ref. está instânciando a classe correta.
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            System.out.println("Participação no Lucro: " + g.getPnl());
        }
        if (funcionario instanceof Vendedor) {
            System.out.println("Venda do Mês: " + ((Vendedor) funcionario).getVendasMes());
        }
    }
}
