package br.com.cursojava.javacore.Ycolecoes.classe;

public class Moto {
    private String marca;
    private String modelo;
    private String chassis;
    private int qtd;

    public Moto(String marca, String modelo, String chassis, int qtd) {
        this.marca = marca;
        this.modelo = modelo;
        this.chassis = chassis;
        this.qtd = qtd;
    }

    public Moto(String marca, String modelo, String chassis) {
        this.marca = marca;
        this.modelo = modelo;
        this.chassis = chassis;
    }

    public Moto(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", chassis='" + chassis + '\'' +
                ", qtd=" + qtd +
                '}';
    }

    /**
     * Regras para equals:
     * Reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null;
     * Simétrico = 'x' e 'y' diferente de null, se x.equals(y) ==true logo y.equals(x) tem que ser true;
     * Transitividade = para x, y, z diferente de null, x.equals(y)==true, logo y.equals(x)==true e x.equals(z)==true, logo y.equals(z)tbm é true;
     * Consistente = x.equals(y) deve sempre retornar o mesmo valor;
     * para x diferente de null, x.equals(null) deve retornar false.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Moto outraMoto = (Moto) obj;
        return chassis != null && chassis.equals(outraMoto.getChassis());
    }

    @Override
    public int hashCode() {
        return chassis != null ? chassis.hashCode() : 1;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
}
