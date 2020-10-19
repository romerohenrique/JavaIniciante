package br.com.cursojava.javacore.heranca8.classe;

/**
 * Classe Funcionário usando o conceito de Herança;
 * extende a Classe Pessoa
 * e acessa os metodos com a super classe.
 */

public class Funcionario extends Pessoa {
    private double salario;


    public Funcionario(String nome){
        super(nome);
    }
    public void imprimir() {
        //sobrescrita de método.
        super.imprimir();
        System.out.println("Salário: R$" + this.salario);
        iprimirComprovantePagamento();
    }

    public void iprimirComprovantePagamento() {
        System.out.println(super.nome + " recebeu a importância de R$" + this.salario + ", pagamento de salário.");
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }
}
