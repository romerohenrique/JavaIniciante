package br.com.cursojava.javacore.classesabstratas12.classe;

public class Gerente extends Funcionario {
    private double salarioComissao;

    public Gerente() {
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                "salario=" + salario +
                ", salario com comissão= R$" + salarioComissao +
                '}';
    }

    @Override
    public void calcularSalario() {
        this.salarioComissao = salario + (salario * 0.2);
    }

    public double getSalarioComissao() {
        return salarioComissao;
    }

    public void setSalarioComissao(double salarioComissao) {
        this.salarioComissao = salarioComissao;
    }
}
