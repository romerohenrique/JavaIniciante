package br.com.cursojava.javacore.exception15.erro.test;

public class ErroTest {
    public static void main(String[] args) {

        stackOverFlowError();
    }

    //pilha de erros até o programa parar, o erro não pode ser tratados
    public static void stackOverFlowError() {
        stackOverFlowError();
    }
}
