package br.com.cursojava.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        /**
         * 3 formas de criar um Array e iniciá-lo
         * interação usando o For Each.
         */
        String[] nomes1 = new String[4];
        String[] nomes2 = new String[]{"João", "Maria", "José", "Pedro"};
        String[] nomes3 = {"João", "Maria", "José", "Pedro"};

// Laço for each: percorre cada espaço de memoria criado pelo Array, com codigo simples.
        for (String auxNome : nomes2) {
            System.out.println(auxNome);
        }
    }
}
