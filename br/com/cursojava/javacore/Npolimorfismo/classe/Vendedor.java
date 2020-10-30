package br.com.cursojava.javacore.Npolimorfismo.classe;

public class Vendedor extends Funcionario {
    private double vendasMes;


    public Vendedor(String nome, double salario, double vendasMes) {
        super(nome, salario);
        this.vendasMes = vendasMes;
    }

    @Override
    public void calcularSalario() {
        this.salario = this.salario + (this.vendasMes * 0.1);
    }

    public double getVendasMes() {
        return vendasMes;
    }

    public void setVendasMes(double vendasMes) {
        this.vendasMes = vendasMes;
    }
}
