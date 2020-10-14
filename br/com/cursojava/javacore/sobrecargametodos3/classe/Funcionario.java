package br.com.cursojava.javacore.sobrecargametodos3.classe;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private double salario;


    public void inserirFucnionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // sobrecarga de métodos
    public void inserirFucnionario(String nome, String cpf, double salario, String rg) {
        inserirFucnionario(nome, cpf, salario);
        this.rg = rg;
    }

    public void imprimirFunionario() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public double getSalario() {
        return salario;
    }


}
