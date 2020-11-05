package br.com.cursojava.javacore.Sdatas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Personalizar datas com SimpleDateFormat
 * pagina da Oracle: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        //Dentro da String, separa-se o que for citação por aspas simples "'citações'";
        String mascara = "'Goiânia,' EEE',' d' de' MMMM' de' yyyy HH:mm";

        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));

    }
}
