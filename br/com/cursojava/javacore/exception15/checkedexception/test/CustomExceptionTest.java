package br.com.cursojava.javacore.exception15.checkedexception.test;

import br.com.cursojava.javacore.exception15.customexception.LoginInvalidoException;

/**
 * sistema de login e senha (basico)
 * personalizando uma Exception
 * criando uma classe que extende a classe Exception
 */

public class CustomExceptionTest {
    public static void main(String[] args) {

        //quando é chamado o método, é obrigatório tratá-lo
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {
        // banco de dados
        String loginBancoDados = "joao";
        String senhaBancoDados = "1234";

        //digitado pelo usuário
        String loginDigitado = "joao";
        String senhaDigitda = "1234";

        if (!loginBancoDados.equals(loginDigitado) || !senhaBancoDados.equals(senhaDigitda)) {
            throw new LoginInvalidoException();
        } else {
            System.out.println("Logado");
        }

    }
}
