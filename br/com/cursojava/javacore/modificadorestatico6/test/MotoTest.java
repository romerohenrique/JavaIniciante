package br.com.cursojava.javacore.modificadorestatico6.test;

import br.com.cursojava.javacore.modificadorestatico6.classe.Moto;

public class MotoTest {
    public static void main(String[] args) {
        Moto m1 = new Moto("BMW", 289);
        Moto m2 = new Moto("HONDA", 270);
        Moto m3 = new Moto("DUCATI", 340);

        m1.imprimir();
        m2.imprimir();
        m3.imprimir();

        System.out.println("*************************************************");
// chamando a variável de classe estática  velocidadeLimite, pela classe Moto, não pelo o Objeto.
        Moto.velocidadeLimite = 130;

        m1.imprimir();
        m2.imprimir();
        m3.imprimir();

    }
}
