package br.com.cursojava.javacore.classesabstratas12.classe;

/**
 * Classe abstrata: ela não pode ser instanciada, mas sim extendida;
 * Classe abstrata: pode conter métodos não abstratos, porém os métodos abstratos, obrigatóriamente
 * precisam que a classe seja abstrata.
 * método abstrato: a classe que extende é obrigado a sobrescrever o método.
 */

public abstract class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;


    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    //método abstrato cirado aoenas pra ser implementado por classes filhas
    public abstract void calcularSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario com comissão= R$" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
