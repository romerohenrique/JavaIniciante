package br.com.cursojava.javacore.Kenum.classe;

public class Cliente {
    //uma outra forma de criar constantes dentro da classe Pai.
    public enum TipoPagamento {
        AVISTA("A"), APRAZO("B");

        private String tipoPagamento;

        TipoPagamento(String tipoPagamento) {
            this.tipoPagamento = tipoPagamento;
        }

        public String getTipoPagamento() {
            return tipoPagamento;
        }

        public void setTipoPagamento(String tipoPagamento) {
            this.tipoPagamento = tipoPagamento;
        }
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
                ", numero= " + tipoCliente.getTipo() +
                ", Forma Pagamento= " + tipoPagamento +
                ", tipo pagamento: " + tipoPagamento.getTipoPagamento() +
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
