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

public class Local {
    private String rua;
    private String bairro;

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Local() {
    }

    public void imprimir() {
        System.out.println("----------Local do Seminário----------");
        System.out.println("Rua: " + this.rua);
        System.out.println("Bairro: " + this.bairro);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
