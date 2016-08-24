package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код

        String[] arrString = s.split(" ");

        String newS = "";

        for (String el : arrString)
        {
            char[] charArr = el.toCharArray();

            if ((!(el.length() == 0)) & (!(el.length() == 1 & el == " ")))

            {
                char firstSymbol = charArr[0];
                String firstSymbolStrBig = Character.toString(firstSymbol).toUpperCase();
                charArr[0] = firstSymbolStrBig.toCharArray()[0];
                el = String.valueOf(charArr);
            }

            newS = newS + (newS.length() > 0 ? " " : "" ) + el;

        }

        System.out.println(newS);
    }


}
