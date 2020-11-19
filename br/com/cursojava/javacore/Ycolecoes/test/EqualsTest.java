package br.com.cursojava.javacore.Ycolecoes.test;

import br.com.cursojava.javacore.Ycolecoes.classe.Moto;

/**
 * Collections : método Equals
 */
public class EqualsTest {
    public static void main(String[] args) {

        String nome1 = "Romero Furtado";
        String nome2 = "Romero Furtado";
        Character letra1 = 'c';
        Character letra2 = new Character('c');

        // retornará true, pq Strings são reutilizadas e estão no pool de Strings
        System.out.println(nome1 == nome2);
        //retornará false, pq criou um objeto, e está alocado em outro endereço de memória
        System.out.println(letra1 == letra2);
        System.out.println(letra1.equals(letra2));
        System.out.println("--------------------------");
        //por mais que sejão dois objetos dará true pois sobrescreveu-se o método equals passando uma vareável referÊncia "chassis"
        Moto moto1 = new Moto("honda", "cg160", "L123890");
        Moto moto2 = new Moto("honda", "cg160", "L123890");
        System.out.println(moto2.equals(moto1));

    }
}
