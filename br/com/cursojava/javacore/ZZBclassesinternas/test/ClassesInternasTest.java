package br.com.cursojava.javacore.ZZBclassesinternas.test;

public class ClassesInternasTest {
    private String nome = "Romero";

    class Interna {
        public void verClasseExterna() {
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClassesInternasTest.this);
        }

    }

    public static void main(String[] args) {
        ClassesInternasTest externa = new ClassesInternasTest();
        //há duas formas de chamar a classe interna---- 1º
        ClassesInternasTest.Interna in = externa.new Interna();
        ClassesInternasTest.Interna in2 = new ClassesInternasTest().new Interna();
        in.verClasseExterna();
        in2.verClasseExterna();

    }

}
