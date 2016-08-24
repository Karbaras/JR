package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = new Integer(reader.readLine());
        int b = new Integer(reader.readLine());

        int min;

        if (a < b)
            min = a;
        else
            min = b;

        System.out.println(min);
    }
}