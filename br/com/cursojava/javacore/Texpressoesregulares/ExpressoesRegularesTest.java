package br.com.cursojava.javacore.Texpressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Expressões: para buscar em um arquivo de texto determinada palavra, letra ou digito;
 */

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        String regex = "java";
        String texto = "aprendendo java diariamente";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start());
        }
    }
}
