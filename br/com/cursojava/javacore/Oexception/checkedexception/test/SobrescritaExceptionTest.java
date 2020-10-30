package br.com.cursojava.javacore.Oexception.checkedexception.test;

import br.com.cursojava.javacore.Oexception.checkedexception.classe.Funcionario;
import br.com.cursojava.javacore.Oexception.checkedexception.classe.Pessoa;
import br.com.cursojava.javacore.Oexception.customexception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();


//a classe Funcionário apenas sobrescrever o método salvar() sem as exceções, dessa forma não é necessário tratá-la.
        f.salvar();

        //já a classe Pessoa, será necessário tratá-la
        try {
            p.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
