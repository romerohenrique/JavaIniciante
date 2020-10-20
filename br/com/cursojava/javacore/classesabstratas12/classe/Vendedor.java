package br.com.cursojava.javacore.classesabstratas12.classe;

public class Vendedor extends Funcionario {
    private double vendaTotal;

    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, double salario, double vendaTotal) {
        super(nome, cpf, salario);
        this.vendaTotal = vendaTotal;

    }

    @Override
    public void calcularSalario() {
        salario = salario + (vendaTotal * 0.005);
        System.out.println("Salário + comissão= R$" + salario);

    }
}
