package br.com.cursojava.javacore.modificadorestatico6.classe;

/**
 * Modificador estático "velocidadeLimite";
 * a variável por ser estática, pertence genuinamente a classe Moto,
 * com isso, quando for instanciada como objeto:se for alterado um atributo estático,
 * todos os objetos modificarão.
 */

public class Moto {
    private String marca;
    private int velocidadeMaxima;
    //modificador estático
    public static int velocidadeLimite;

    public Moto(String marca, int velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Moto() {
    }

    public void imprimir() {
        System.out.println("______________________________________________");
        System.out.println("Marca " + this.marca);
        System.out.println("Velocidade Máxima " + this.velocidadeMaxima);
        //pelo o atributo velocidadeLimite ser estático, não necessita chamar pelo this, pois não é pertencente do objeto.
        System.out.println("Velocidade Limite " + velocidadeLimite);
    }

    //Metodos estáticos: o atributo tem que ser estático para ser acessado.
    public static int getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(int velocidadeLimite) {
        Moto.velocidadeLimite = velocidadeLimite;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
