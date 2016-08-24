package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[5];

        arr[0] = Integer.parseInt(reader.readLine());
        arr[1] = Integer.parseInt(reader.readLine());
        arr[2] = Integer.parseInt(reader.readLine());
        arr[3] = Integer.parseInt(reader.readLine());
        arr[4] = Integer.parseInt(reader.readLine());

        int minimum = min(arr);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int arr[])
    {
        int min = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (min > arr[i]) min = arr[i];
            }

        return min;
    }

}
