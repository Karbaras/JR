package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        char chSpace = " ".toCharArray()[0];

        List<Character> arrVowel = new ArrayList<Character>();
        List<Character> arrConsonant = new ArrayList<Character>();

        char[] sChars = s.toCharArray();

        for (int i = 0; i < sChars.length; i++)
        {
            char ch = sChars[i];
            if (isVowel(ch)) {
                arrVowel.add(ch);
                arrVowel.add(chSpace);
            }
            else {

                if (!Character.toString(ch).equals(Character.toString(chSpace))) {arrConsonant.add(ch); arrConsonant.add(chSpace);}

            }
        }


        for (int i = 0; i < arrVowel.size(); i++) {
            if (i == arrVowel.size()-1) System.out.println(arrVowel.get(i));
            else System.out.print(arrVowel.get(i));
        }

        for (int i = 0; i < arrConsonant.size(); i++) {
            if (i == arrConsonant.size()-1) System.out.println(arrConsonant.get(i));
            else System.out.print(arrConsonant.get(i));
        }

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
