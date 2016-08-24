package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  a = new Integer(reader.readLine());
        String s1 = "";
        String s2 = "";

        String text = "";

        if (a == 0) s1 = "нулевое";
        else if (a > 0) s1 = "положительное";
        else if (a < 0) s1 = "отрицательное";

        if (a != 0) {
            if (a % 2 == 0) s2 = " четное";
            else  s2 = " нечетное";
        }

        System.out.println(s1 + s2 + " число");
    }
}
