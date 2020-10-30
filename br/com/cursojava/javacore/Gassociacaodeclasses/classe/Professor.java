package br.com.cursojava.javacore.Gassociacaodeclasses.classe;

/**
 * Associação de Classes: Sistema de gerenciamento de seminários
 * Seminario; Local; Professor; Aluno;
 * um aluno só poderá estar em um seminário;
 * um seminario poderá ter nenhum ou vários alunos;
 * um professor poderá ministrar um ou vários seminários;
 * um seminário só poderá ter um professor;
 * um seminário só poderá ter um local
 */

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void imprimir() {
        System.out.println("----------Professor Participante----------");
        System.out.println("Pofessor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("-------------Seminários-------------");
        if (seminarios != null) {
            for (Seminario semi : seminarios) {
                System.out.println(semi.getTitulo() + " ");
            }

        } else {
            System.out.println("Nenhum Seminário Cadastrado");
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminarios;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminarios = seminario;
    }
}
