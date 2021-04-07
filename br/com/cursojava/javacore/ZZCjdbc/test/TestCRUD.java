package br.com.cursojava.javacore.ZZCjdbc.test;


import java.util.Scanner;

public class TestCRUD {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int op;
        while (true) {
            menu();
            op = Integer.parseInt(teclado.nextLine());
            if (op == 0) {
                System.out.println("Saindo do sistema");
                break;
            }
            if (op == 1) {
                menuComprador();
                op = Integer.parseInt(teclado.nextLine());
                CompradorCRUD.executar(op);
            }
            if (op == 2) {
                menuCarro();
                op = Integer.parseInt(teclado.nextLine());
                CarroCRUD.executar(op);
            }

        }
    }

    public static void menu() {
        System.out.println("Escolha a opção");
        System.out.println("1, Comprador");
        System.out.println("2, Carro");
        System.out.println("0, sair");
    }

    public static void menuComprador() {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1, Inserir comprador");
        System.out.println("2, Atualizar comprador");
        System.out.println("3, Listar toso os comprador");
        System.out.println("4, Buscar comprador por nome");
        System.out.println("5, Deletar comprador");
        System.out.println("9, Sair");

    }

    public static void menuCarro() {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1, Inserir carro");
        System.out.println("2, Atualizar carro");
        System.out.println("3, Listar toso os carro");
        System.out.println("4, Buscar carro por nome");
        System.out.println("5, Deletar carro");
        System.out.println("9, Sair");

    }

}
