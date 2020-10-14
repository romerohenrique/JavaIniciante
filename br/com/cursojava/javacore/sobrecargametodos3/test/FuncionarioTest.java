package br.com.cursojava.javacore.sobrecargametodos3.test;

import br.com.cursojava.javacore.sobrecargametodos3.classe.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.inserirFucnionario("Bastiao da Silva", "999.098.788-88", 1200, "12345-6");
        func.imprimirFunionario();
    }
}
