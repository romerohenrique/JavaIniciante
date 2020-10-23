package br.com.cursojava.javacore.associacaodeclasses7.classe;
/**
 * Associação de Classes: Sistema de gerenciamento de seminários
 * Seminario; Local; Professor; Aluno;
 * um aluno só poderá estar em um seminário;
 * um seminario poderá ter nenhum ou vários alunos;
 * um professor poderá ministrar um ou vários seminários;
 * um seminário só poderá ter um professor;
 * um seminário só poderá ter um local
 */

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;


    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    public void cadastrar(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimir() {
        System.out.println("---------Relatório de Alunos--------");
        System.out.println("Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminário: " + this.seminario.getTitulo());
        } else {
            System.out.println("Aluno não está cadastrado em nenhum seminário");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }


}
