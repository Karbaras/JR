package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }

        int min = 0;
        ArrayList<String> listForPrint = new ArrayList<String>();

        for (int i = 0; i < 5; i++)
        {
            int strLength = list.get(i).length();
            if (strLength > 0 && min == 0)
            {
                min = strLength;
                listForPrint.add(list.get(i));
            } else if (strLength < min)
            {
                listForPrint.clear();
                min = strLength;
                listForPrint.add(list.get(i));
            } else if (strLength == min)
            {
                listForPrint.add(list.get(i));
            }
        }

        for (int i = 0; i < listForPrint.size(); i++)
        {
            System.out.println(listForPrint.get(i));
        }

    }
}
