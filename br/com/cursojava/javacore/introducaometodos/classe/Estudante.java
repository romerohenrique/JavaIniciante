package br.com.cursojava.javacore.introducaometodos.classe;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void imprirEstuante() {
        System.out.println("Estudante: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (notas != null)
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }

    }

    public void somarMedia() {
        if (notas == null) {
            System.out.println("Aluno sem notas");
            return;
        }
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;

        if (media > 6) {
            System.out.println("\nA média do aluno " + nome + ", foi de " + media + ". \nSituação: Aluno  Aprovado");
        } else {
            System.out.println("\nA média do aluno " + nome + ", foi de " + media + ". \nSituação: Aluno  Reprovado");
        }
    }
}

