package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = 3;

        int[] arr = new int[i];

        for (int a = 0; a < i; a++) arr[a] = new Integer(reader.readLine());

        for (int a = 0; a < i; a++) {
            for (int b = i-1; b >= a; b--) {
                if (arr[a] > arr[b]) {
                    int z = arr[b];
                    arr[b] = arr[a];
                    arr[a] = z;
                }
            }
        }

        for (int a = i-1; a >= 0; a--) System.out.println(arr[a]);

    }
}
