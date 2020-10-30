package br.com.cursojava.javacore.RString;

/**
 * String no Java são imultáveis
 * dentro da classe String há um método String Constant Pool: que evita que haja duplicidade de palavras
 * economizando memória.
 */

public class StringTest {
    public static void main(String[] args) {
        //  há duas formas de criar uma String
        String name = "Pedro";// 1º
        String lastName = new String(" Franklin");// 2º cm String é uma classe pode ser criado um objeto.
        System.out.println(name + lastName);


        String nome = "Romero";
        nome += " Furtado"; // há tambem essa forma de concatenação
        System.out.println(nome);

        // Dentro da classe String há um método concat

        String n = "Joaquim ";
        n = n.concat("Feitosa");
        System.out.println(n);
    }
}
