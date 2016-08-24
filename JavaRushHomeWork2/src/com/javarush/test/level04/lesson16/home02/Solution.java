package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int[3];

        for (int i = 0; i < a.length; i++) a[i] = new Integer(reader.readLine());

        for (int i = 0; i < a.length; i++) {
            for (int z = a.length -1; z > i; z--) {
                if (a[i] > a[z]) {
                    int b = a[i];
                    a[i] = a[z];
                    a[z] = b;
                }
            }
        }

        System.out.println(a[1]);
    }
}
