package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] arr20 = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr20.length; i++) arr20[i] = Integer.parseInt(reader.readLine());

        int[] arr10_1 = new int[10];
        int[] arr10_2 = new int[10];

        for (int i = 0; i < arr20.length; i++)
        {
            if (i < 10) arr10_1[i] = arr20[i];
            else arr10_2[i-10] = arr20[i];
        }

        for (int i = 0; i < arr10_2.length; i++) System.out.println(arr10_2[i]);

    }
}
