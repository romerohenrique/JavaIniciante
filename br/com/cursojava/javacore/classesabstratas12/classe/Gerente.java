package br.com.cursojava.javacore.classesabstratas12.classe;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }


    @Override
    public void calcularSalario() {
        salario = salario + (salario * 0.02);
        System.out.println("Salário + comissão= R$" + salario);
    }
}
