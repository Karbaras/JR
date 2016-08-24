package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arrInt[] = new int[3];

        arrInt[0] = new Integer(reader.readLine());
        arrInt[1] = new Integer(reader.readLine());
        arrInt[2] = new Integer(reader.readLine());

        for (int i = arrInt.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrInt[j] < arrInt[j+1]) {
                    int tmp = arrInt[j];
                    arrInt[j] = arrInt[j+1];
                    arrInt[j+1] = tmp;
                }
            }
        }

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

    }
}
