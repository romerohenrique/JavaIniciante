package br.com.cursojava.javacore.Sdatas;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDatasTest {
    public static void main(String[] args) {
        // forma até o java 6
        Date date = new Date();
        // adiciona  as horas
        date.setTime(date.getTime() + 7_600_00L);
        System.out.println(date);

        Calendar c = Calendar.getInstance();

        if (Calendar.SUNDAY == c.getFirstDayOfWeek()) {
            System.out.println("Doming é o prieiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

    }
}
