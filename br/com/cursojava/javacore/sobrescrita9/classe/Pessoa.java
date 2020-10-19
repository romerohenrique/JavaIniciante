package br.com.cursojava.javacore.sobrescrita9.classe;

public class Pessoa {
    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "nome: " + this.nome + "; Idade: " + this.idade;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
