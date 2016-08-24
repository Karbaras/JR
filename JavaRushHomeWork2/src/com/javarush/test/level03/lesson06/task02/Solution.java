package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        for (int i = 1; i <=10; i++) {
            System.out.print(i);
            System.out.print(" ");

            for (int z = 2; z <=10; z++) {
                if (z == 10) System.out.println(i*z);
                else {
                    System.out.print(i*z);
                    System.out.print(" ");

                }
            }
        }

    }
}