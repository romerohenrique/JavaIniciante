package br.com.cursojava.javacore.ZZBclassesinternas.test;

public class ClassesLocaisTest {
    //classes interna dentro de métodos
    private String nome = "Romero";

    public void executaMeodos() {
        String sobrenome = "Furtado";
        class Interna {
            public void imprimirNomeExterno() {
                System.out.println(nome);
                System.out.println(sobrenome);
            }
        }
        Interna in = new Interna();
        in.imprimirNomeExterno();
    }

    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.executaMeodos();
    }
}
