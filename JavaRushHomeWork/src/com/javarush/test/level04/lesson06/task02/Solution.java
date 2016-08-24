package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = new Integer(reader.readLine());
        int b = new Integer(reader.readLine());
        int c = new Integer(reader.readLine());
        int d = new Integer(reader.readLine());

        if (a > b && a > c && a > d)
            System.out.println(a);
        else if (b > a && b > c && b > d)
            System.out.println(b);
        else if (c > a && c > b && c > d)
            System.out.println(c);
        else if (d > a && d > b && d > c)
            System.out.println(d);






    }
}
