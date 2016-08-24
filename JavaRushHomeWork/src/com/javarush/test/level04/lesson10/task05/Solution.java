package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a = 1;
        int b;
        String text;

        while (a <= 10) {
            text = "";
            b = 1;
            while (b <= 10) {
                if (b == 1) {
                    text = text + (a*b);
                } else {
                    text = text + " " + (a*b);
                }
                b++;
            }
            System.out.println(text);
            a++;
        }

    }
}
