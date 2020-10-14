package br.com.cursojava.javacore.introducaometodos2.test;

import br.com.cursojava.javacore.introducaometodos2.classe.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        /**
         * Instanciando o objeto Calculador ;
         * invocando os metodos de: somar, dividir, subtrair e multiplicar.
         *
         */

        Calculadora calc = new Calculadora();
        calc.somarDoisNumeros(4,6);
        calc.subtraurDoisNumeros(55,44);
        calc.dividirDoisNumeros(44,22);
        calc.multiplicarDoisNumeros(12,34);
    }
}
