package br.com.cursojava.javacore.ZZAgenerics.classe;

public class VideoGame {
    private String modelo;

    public VideoGame(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "modelo='" + modelo + '\'' +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
