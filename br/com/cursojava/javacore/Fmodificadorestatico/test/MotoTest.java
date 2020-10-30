package br.com.cursojava.javacore.Fmodificadorestatico.test;

import br.com.cursojava.javacore.Fmodificadorestatico.classe.Moto;

public class MotoTest {
    public static void main(String[] args) {

        Moto m1 = new Moto("BMW", 289);
        Moto m2 = new Moto("HONDA", 270);
        Moto m3 = new Moto("DUCATI", 340);
        Moto.setVelocidadeLimite(130);
        m1.imprimir();
        m2.imprimir();
        m3.imprimir();


    }
}
