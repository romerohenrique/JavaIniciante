package br.com.cursojava.introducao.arrays;

public class Arrays4 {
    public static void main(String[] args) {
        /**
         * Array multidimensionais
         */
        String[][] cidades = new String[2][2];

        cidades[0][0] = "Goiânia";
        cidades[0][1] = "São Paulo";
        cidades[1][0] = "São Luís";
        cidades[1][1] = "Imperatriz";

        System.out.println("Usando for ");

        for (int i = 0; i < cidades.length; i++) {
            System.out.println(cidades);

            for (int j = 0; j < cidades[i].length; j++) {
                System.out.println(cidades[i][j]);
            }
        }
        System.out.println("Usando for each");

        for (String[] ref : cidades) {
            System.out.println(ref);
            for (String cidade : ref) {
                System.out.println(cidade);
            }
        }
    }
}
