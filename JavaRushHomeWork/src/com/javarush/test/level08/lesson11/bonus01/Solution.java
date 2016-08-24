package com.javarush.test.level08.lesson11.bonus01;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat format = new SimpleDateFormat("MMMM", Locale.ENGLISH);

        Calendar calendar = new GregorianCalendar();

        String month = reader.readLine();
        int monthNumber = 0;

        try
        {
            calendar.setTime(format.parse(month));
            monthNumber = calendar.get(Calendar.MONTH) + 1;
        } catch (ParseException ex) {

        }

        System.out.println(month + " is " + monthNumber + " month");

    }

}
