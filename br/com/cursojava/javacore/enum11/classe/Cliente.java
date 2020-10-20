package br.com.cursojava.javacore.enum11.classe;

public class Cliente {
    //uma outra forma de criar constantes dentro da classe Pai.
    public enum TipoPagamento {
        AVISTA, APRAZO
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;


    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente= " + tipoCliente.getNome() +
                ", tipoPagamento= " + tipoPagamento +
                ", numero= " + tipoCliente.getTipo() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
}
