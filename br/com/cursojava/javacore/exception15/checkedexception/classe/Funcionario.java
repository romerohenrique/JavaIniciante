package br.com.cursojava.javacore.exception15.checkedexception.classe;

import br.com.cursojava.javacore.exception15.customexception.LoginInvalidoException;

import java.io.FileNotFoundException;

/**
 * Na sobrescrita de métodos que há Exceções
 * Pode sobrescrever sem exceções ou com quatas houverem
 * desde que esteja na classe extendida ou seja subclasses da(s) mesma(s) declarada.
 */

public class Funcionario extends Pessoa {
    @Override
    public void salvar() {
    }
}
