package br.com.cursojava.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        /**
         * percorrendo o Array utilizando o length dentro do laço for.
         */
        String[] cervejas = new String[4];
        cervejas[0]="Skol";
        cervejas[1]="Guinness";
        cervejas[2]="Brahma";
        cervejas[3]="Petra";
        System.out.println("-------------");
        System.out.println("|  Cervejas |");
        System.out.println("-------------");
        for (int i = 0; i < cervejas.length; i++){
            System.out.println(cervejas[i]);
        }
    }
}
