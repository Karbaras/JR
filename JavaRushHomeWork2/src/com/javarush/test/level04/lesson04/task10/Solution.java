package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String sText = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = new Integer(reader.readLine());
        int n2 = new Integer(reader.readLine());
        int n3 = new Integer(reader.readLine());

        if (n1 == n2 & n1 == n3) sText = "" + n1 + " " + n2 + " " + n3;
        else if (n1 == n2) sText =  "" + n1 + " " + n2;
        else if (n1 == n3) sText =  "" + n1 + " " + n3;
        else if (n2 == n3) sText =  "" + n2 + " " + n3;

        if (sText.length() > 0) System.out.println(sText);


    }
}