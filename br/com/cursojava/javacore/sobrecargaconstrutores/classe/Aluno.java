package br.com.cursojava.javacore.sobrecargaconstrutores.classe;

public class Aluno {
    /**
     * Sobrecarga de Construtores
     * utilizando this() para chamar um construtor dentro de outro para acessar todos os parâmetros;
     */
    private String matricula;
    private String nome;
    private double[] notas;
    private String cpf;


    public Aluno(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Aluno(String matricula, String nome, double[] notas, String cpf) {
        this(matricula, nome, notas);
        this.cpf = cpf;
    }


    public void imprimir() {
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.cpf);
        for (double nota : this.notas) {
            System.out.println(nota + " ");
        }

    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
