package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        boolean readble = true;
        while (readble) {
            String inputString = reader.readLine();
            if (inputString.isEmpty()) break;
            int id = Integer.parseInt(inputString);
            inputString = reader.readLine();
            if (inputString.isEmpty()) break;
            String name = inputString;

            map.put(name, id);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("" + entry.getValue() + " " + entry.getKey());
        }
    }
}
