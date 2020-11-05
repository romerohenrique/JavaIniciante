package br.com.cursojava.javacore.Sdatas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale locChina = new Locale("zh", "zh");
        Locale locFranca = new Locale("fr", "fr");
        Locale locNovaZelandia = new Locale("is", "is");
        Locale locJapao = new Locale("ja", "ja");


        Calendar c = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locChina);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locFranca);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locNovaZelandia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);

        //formatando as datas de acordo com os países
        System.out.println("China " + df1.format(c.getTime()));
        System.out.println("França " + df2.format(c.getTime()));
        System.out.println("Nova Zelândia: " + df3.format(c.getTime()));
        System.out.println("Japão: " + df4.format(c.getTime()));
        System.out.println("____________________________________");

        //Lingua do país da data em portugues ou na escrita nativa, passando o país no parâmetro
        System.out.println("China -  " + locChina.getDisplayLanguage(locChina));
        System.out.println("França -  " + locFranca.getDisplayLanguage(locFranca));
        System.out.println("Nova Zelândia -  " + locNovaZelandia.getDisplayLanguage(locNovaZelandia));
        System.out.println("Japão -  " + locJapao.getDisplayLanguage(locJapao));

    }
}

