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

        String n ="Paulo";
        n = n.concat("Feitosa");
        System.out.println(n);

        System.out.println("___________________________________________________");
        //métodos mais utilizados da classe String

        String test ="Paulo";
        System.out.println(test.equals(n));// compara uma String com a outra.
        System.out.println(test.toUpperCase());// tornar tudo em letras maiúsculas
        System.out.println(test.toLowerCase());// tornar tudo letras minusculas
        System.out.println(test.length());// tamaho da String
        System.out.println(test.charAt(2));// busca a letra da posição da String
        System.out.println(test.substring(0, 4));// pega posição da letra até segundo ponto ou até final
        System.out.println(test.trim()); // tira espaço da String

    }
}
