package br.com.cursojava.javacore.blocodeinicializacao5.test;


import br.com.cursojava.javacore.blocodeinicializacao5.classe.Financiamento;

public class FinanciamentoTest {
    public static void main(String[] args) {
        Financiamento fin = new Financiamento();
        for (int parcelas : fin.getParcelas()) {
            System.out.print(parcelas + " ");
        }
    }
}
