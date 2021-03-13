package br.com.cursojava.javacore.Ycolecoes.classe;

import java.util.Objects;

public class Nota implements Comparable<Nota> {
    private String id;
    private String nome;
    private Integer nota;

    public Nota(String id, String nome, Integer nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota = (Nota) o;
        return Objects.equals(id, nota.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Nota{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNota() {

        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    //método implementado da interface Comparable
    @Override
    public int compareTo(Nota newnota) {
        return this.nota.compareTo(newnota.nota);
    }
}
