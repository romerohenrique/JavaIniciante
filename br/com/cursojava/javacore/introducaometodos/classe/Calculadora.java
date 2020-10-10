package br.com.cursojava.javacore.introducaometodos.classe;

/**
 * Classe Calculadora: criando metodos e seus parâmetros para execução dinamica na classe instaciadora
 */

public class Calculadora {

    public void somarDoisNumeros(int num, int num2) {
        System.out.println( num + " + " + num2+" =");
        System.out.println(num + num2);
    }

    public void subtraurDoisNumeros(int num, int num2) {
        System.out.println(  num + " - " + num2+" =");
        System.out.println(num - num2);
    }

    public void dividirDoisNumeros(double num, double num2) {
        System.out.println( num + " / " + num2+" =");
        System.out.println(num / num2);
    }

    public void multiplicarDoisNumeros(double num, double num2) {
        System.out.println( num + " * " + num2+" =");
        System.out.println(num * num2);
    }
}