package br.com.cursojava.javacore.Oexception.customexception;

/**
 * classe de exceção  não é recomendado tratar exceções, por conta da volatilidade das regras de negócio.
 */

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Login ou Senha Inválida");
    }
}
