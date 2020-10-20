package br.com.cursojava.javacore.enum11.classe;

/**
 * Classe de tipo Enum, é uma forma mais coerente de se fazer constantes
 */

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int tipo;
    private String nome;

    //O construtor não pode ser public pois deixarar funerável à ações externas;
    //Por default já é private, com isso não é necessário declarar visibilidade.
    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }
//são usados apenas os métodos gets para obter os dados
    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
