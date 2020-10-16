package br.com.cursojava.javacore.associacaodeclasses7.classe;

import java.util.Arrays;

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
