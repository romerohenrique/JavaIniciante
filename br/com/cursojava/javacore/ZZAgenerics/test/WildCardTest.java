package br.com.cursojava.javacore.ZZAgenerics.test;

abstract class Automovel {
    public abstract void consultar();
}
class Carro extends Automovel {
    @Override
    public void consultar() {
        System.out.println("Carro avaliado");
    }
}
class Moto extends Automovel{
    @Override
    public void consultar() {
        System.out.println("Moto avaliada");
    }
}
public class WildCardTest {
    public static void main(String[] args) {

    }
}
