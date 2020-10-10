package br.com.cursojava.introducao.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        /**
         * formas de iniciar um Array multidimensional
         * array com tamanhos distintos
         */

        String[][] cidades = {{"Goiania", "Sao paulo"}, {"floripa", "caxias", "rio de janeiro"}, {"sao luis"}};
        String[][] cidades1 = new String[3][];
        cidades1[0] = new String[]{"Goiania", "Sao paulo"};
        cidades1[1] = new String[]{"floripa", "caxias", "rio de janeiro"};
        cidades1[2] = new String[]{"sao luis"};

        for (String[] ref : cidades) {
            System.out.println(ref);
            for (String cidade : ref) {
                System.out.println(cidade);
            }
        }
        System.out.println("-------------Outra inicialização--------------------");
        for (String[] ref1 : cidades1) {
            System.out.println(ref1);
            for (String cidade1 : ref1) {
                System.out.println(cidade1);
            }
        }
    }
}
