package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {

        isDateOdd("JANUARY 1 2000");
    }

    public static boolean isDateOdd(String date)
    {
        Date mydate;
        boolean isDateOdd = false;
        SimpleDateFormat format = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);
        try
        {
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(format.parse(date));
            if ((calendar.get(Calendar.DAY_OF_YEAR) % 2) > 0) isDateOdd = true;
        } catch (ParseException ex) {
//            System.out.println(ex);
//            mydate = new Date(1,1,1);
        }

        return isDateOdd;
    }
}
