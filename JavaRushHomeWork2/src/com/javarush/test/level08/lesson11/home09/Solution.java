package com.javarush.test.level08.lesson11.home09;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {

        Date currentDate = new Date(date);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(currentDate);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

        return (dayOfYear % 2 == 0) ? false : true ;
    }
}
