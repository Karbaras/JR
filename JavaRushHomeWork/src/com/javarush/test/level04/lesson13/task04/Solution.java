package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.println(8);
            } else {
                System.out.print(8);
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(8);
        }
    }
}
