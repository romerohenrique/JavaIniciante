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
 * \\W = tudo o que não for caracter de palavra;
 *  [] = bloco para busca;
 *  codificadores:
 *  ? zero ou uma;
 *  * zero ou mais;
 *  + uma ou mais;
 *  {n,m} de a n até m;
 *  () condiçoes;
 *  | um ou outro;
 *  $ fim de linha
 */

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // encontrar hexadecimal
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0x01FFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " "+matcher.group());
        }
    }
}
