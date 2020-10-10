package br.com.cursojava.introducao.controledefluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {
        /***
         * Condicional usado Switch
         * usando a variavael do tipo inteira pra fazer o contador da interação
         */
        int dia = 7;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Segunda-feira");
                System.out.println("Dia últil");
                break;
            case 3:
                System.out.println("Terça-feira");
                System.out.println("Dia últil");
                break;
            case 4:
                System.out.println("Quarta-feira");
                System.out.println("Dia últil");
                break;
            case 5:
                System.out.println("Quinta-feira");
                System.out.println("Dia últil");
                break;
            case 6:
                System.out.println("Sexta-feira");
                System.out.println("Dia últil");
                break;
            case 7:
                System.out.println("Sábado ");
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Opção inválida!");


        }

    }
}
