package br.com.cursojava.javacore.Texpressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Expressões: para buscar em um arquivo de texto determinada palavra, letra ou digito;
 * Meta Caracteres:
 * \\d = todos os dígitos;
 * \\D = tudo que não for dígito;
 * \\s = espaço em branco \t , \n , \f , \r ;
 * \\S = caractere que não é branco;
 * \\w = caractere de palavras a-z A-Z , digitos e _ (underline);
 * \\W = tudo o que não for caracter de palavra.
 */

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        String regex = "\\W";
        String texto = "aprendendo*&Java7 diariamente";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
