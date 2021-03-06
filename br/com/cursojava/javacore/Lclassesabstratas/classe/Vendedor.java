package br.com.cursojava.javacore.Lclassesabstratas.classe;

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
        this.salario = salario + (vendaTotal * 0.05);
    }
}
