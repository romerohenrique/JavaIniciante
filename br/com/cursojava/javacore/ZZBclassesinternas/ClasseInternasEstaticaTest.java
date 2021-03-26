package br.com.cursojava.javacore.ZZBclassesinternas;

/**
 * Classes internas estáticas
 */
class Externa {
    static class Interna {
        public void imprimir() {
            System.out.println("Classe estática");
        }
    }
}

public class ClasseInternasEstaticaTest {
    public static void main(String[] args) {

        Externa.Interna i1 = new Externa.Interna();
        i1.imprimir();
        Interna2 i2 = new Interna2();
        i2.imprimir();
    }

    static class Interna2 {
        public void imprimir() {
            System.out.println("Classe estática, dentro da classe publica");
        }
    }
}
