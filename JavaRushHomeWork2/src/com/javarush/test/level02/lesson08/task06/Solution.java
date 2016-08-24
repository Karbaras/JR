package com.javarush.test.level02.lesson08.task06;

/* Вывод текста на экран
Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
*/
public class Solution
{
    public static void print3(String s)
    {
        //напишите тут ваш код
        for (int i = 0; i < 3; i++) {
            String p = i == 0 ? "" : " ";
            if (i < 2) {
                System.out.print(p + s);
            } else System.out.println(p + s);
        }

    }
    public static void main(String[] args)
    {
        print3("window");
        print3("file");
    }
}