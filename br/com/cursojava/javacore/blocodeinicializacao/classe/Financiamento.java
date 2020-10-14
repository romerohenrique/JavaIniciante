package br.com.cursojava.javacore.blocodeinicializacao.classe;

/**
 * Bloco de Inicialização
 * iniciliza as variáveis antes do construtor;
 * o bloco de inicialização por convenção é escrito anstes do construtor(porque na compilação ele será lido antes do
 * construtor independentimente).
 */

public class Financiamento {
    private int[] parcelas;


    {
        parcelas = new int[36];
        System.out.println("detro do bloco de inicialização");
        for (int i = 1; i <= parcelas.length; i++) {
            parcelas[i - 1] = i;
        }
    }

    // construtor
    public Financiamento() {

    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
