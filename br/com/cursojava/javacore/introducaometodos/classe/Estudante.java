package br.com.cursojava.javacore.introducaometodos.classe;

public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;


    public void imprirEstuante() {
        System.out.println("Estudante: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (notas != null)
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

    }

    public void somarMedia() {
        if (notas == null){
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

