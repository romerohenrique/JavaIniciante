package br.com.cursojava.javacore.modificadorfinal10.classe;

public class Comprador {
    private String nome;
    @Override
    public String toString() {
        return "'"+nome+"'";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
