package br.com.cursojava.javacore.RString;

/**
 * A String Builder é uma classe por isso sua inicialização é mais rápida
 * quando se tratando de várias Strings em um sistemas senod inicializada.
 */

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(19);

        //Forma de ler uma Strig  e/ ou concatenação é chamar oo método "append" .
        sb.append("pou");
        System.out.println(sb);
        //inserindo uma string pegando a posição e passando a nova string
        sb.insert(3, 3456);
        System.out.println(sb);
        //deletando uma string do passando o pponto de inicio e fim
        sb.delete(3,6);
        System.out.println(sb);
        //inverte as Strings
        sb.reverse();
        System.out.println(sb);

    }
}
