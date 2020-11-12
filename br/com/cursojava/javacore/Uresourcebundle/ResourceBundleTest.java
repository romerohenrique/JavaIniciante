package br.com.cursojava.javacore.Uresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(rb.getString("hello"));
        //utilizando Herança de menssagens (messages.properties) / que tbm pode ser sobrescrito no arquivo do idioma local
        System.out.println(rb.getString("video"));

        // pode alterar o idioma panes a mudando a Locale
        rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(rb.getString("hello"));
        // chave sobrescrita
        System.out.println(rb.getString("video"));

    }
    /**
     * o Java tem um processo recursivo para encontrar as mensagens determinada idioma:
     *  exemplo:
     *  Locale locale = new Locale("pt","PT");
     *  ResourceBudle.getBundle("messagens",locale);
     *  caso não encontre:
     *  // messagens_pt_PT.properties      - se caso não encontre a localização e lingua
     *  // messagens_pt.properties         - ele buscará a língua, caso ele não encontre
     *  // messagens_pt_BR.properties      - ele buscará na localização padrão da máquina,e se caso não encontre
     *  // messagens_pt.properties         - ele vai buscar na lingua padrão da máquina, e caso não encontre
     *  // messagens.properties            - ele vai buscar apenas pelo base name, e se caso ele não encontre
     *  // ele lançará uma mensagem de exceção: MissingResourceException
     */
}
