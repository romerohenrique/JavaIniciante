package br.com.cursojava.javacore.Hheranca.classe;

public class Endereco {
    private String rua;


    public void imprimir() {
        System.out.println("endereço: " + this.rua);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
