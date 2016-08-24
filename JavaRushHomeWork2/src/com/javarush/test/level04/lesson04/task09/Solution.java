package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> colors = new ArrayList<>();

        int timeGrin = 3;
        int timeYellou = 0;
        int timeRed = 0;


        for (int i = 0; i < 60 ; i++)
        {
            if (timeGrin > 0)
            {
                colors.add(i, "зеленый");
                timeGrin--;
                if (timeGrin == 0) timeYellou = 1;
                continue;
            }

            if (timeYellou > 0)
            {
                colors.add(i, "желтый");
                timeYellou--;
                if (timeYellou ==0) timeRed = 1;
                continue;

            }

            if (timeRed > 0)
            {
                colors.add(i, "красный");
                timeRed--;
                if (timeRed ==0) timeGrin = 3;
                continue;

            }
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double time = new Double(reader.readLine());
        System.out.println(colors.get((int) time));
    }
}