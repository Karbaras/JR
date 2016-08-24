package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = new Integer(reader.readLine());

        for (int i = 0; i < 3; i++) {
            int z = new Integer(reader.readLine());
            if (z > n) n = z;
        }

        System.out.println(n);

    }
}
