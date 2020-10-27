package br.com.cursojava.javacore.exception15.runtimeexception.test;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        /**
         * erros de programação:
         * Erro em tempode eexecução Arithmetic Exception
         * divisão de inteiro por zero.
         */
        int a = 5;
        int b = 0;

        // por mais que haja tratamento, sempre apresentará o erro.
        if (a != 0) {
            int c = a / b;
            System.out.println(c);
        }

        /**
         * outro erro comum, NullPointerException: quando a variável de referência
         * não faz referência a nenhum objeto,  e tenta chamar um atributo ou método.
         */
        Object o = null;

        System.out.println(o.toString());

        /**
         *Outro erro de programação : ArrayIndexOutOfBoundsException
         */

        int[] e = new int[2];
        // são duas posições [0] [1] e tenta-se acessar uma posição não existente.
        System.out.println(e[2]);
    }
}
