package br.com.cursojava.javacore.enum11.test;

import br.com.cursojava.javacore.enum11.classe.Cliente;
import br.com.cursojava.javacore.enum11.classe.TipoCliente;

/**
 * Enum: usa atributo do TipoCliente. Se torna muito mais seguro, pra não correr o risco de se
 * passado um valor que não exista.
 */

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente("Francisco", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.AVISTA);
        Cliente c1 = new Cliente("Magali", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.APRAZO);

        System.out.println(c);
        System.out.println("________________________");
        System.out.println(c1);
    }
}
