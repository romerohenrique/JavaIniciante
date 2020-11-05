package br.com.cursojava.javacore.Sdatas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Number Format: formatação de números
 */

public class NumberFormatTest {
    public static void main(String[] args) throws ParseException {

        float numero = 2334.567f;

        Locale locChina = new Locale("Zh", "ZH");
        Locale locItaly = new Locale("it", "it");
        Locale locUsa = new Locale("en", "us");
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getIntegerInstance();
        nf[1] = NumberFormat.getIntegerInstance(locUsa);
        nf[2] = NumberFormat.getCurrencyInstance();
        nf[3] = NumberFormat.getCurrencyInstance(locUsa);

        for (NumberFormat nfa : nf) {
            System.out.println(nfa.format(numero));
        }

        NumberFormat nf2 = NumberFormat.getInstance();
        //pega todas as frações
        System.out.println(nf2.getMaximumFractionDigits());

        //pega o numero máximo da fração
        nf2.setMaximumFractionDigits(1);
        System.out.println(nf2.format(numero));

        String valor = "145,6745";

        System.out.println(nf2.parse(valor));

        // passando para inteiro
        nf2.setParseIntegerOnly(true);
        System.out.println(nf2.parse(valor));

    }
}
