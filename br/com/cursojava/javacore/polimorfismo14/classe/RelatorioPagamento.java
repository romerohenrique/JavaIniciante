package br.com.cursojava.javacore.polimorfismo14.classe;

public class RelatorioPagamento {

    public void pagamentoFuncionario(Funcionario funcionario) {
        System.out.println("Relatório de pagamento de Funcionário");
        System.out.println("Nome:" + funcionario.getNome());
        System.out.println("Salário:" + funcionario.getSalario());
    }
}
