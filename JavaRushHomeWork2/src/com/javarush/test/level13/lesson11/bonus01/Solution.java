package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        FileInputStream stream = new FileInputStream(fileName);
        BufferedReader bufferedReaderFile = new BufferedReader(new InputStreamReader(stream));

        String s;

        List<Integer> integers = new ArrayList<>();

        while ((s = bufferedReaderFile.readLine()) != null) {
            try
            {
                int a = Integer.parseInt(s);
                if (a%2==0) integers.add(a);
            } catch (NumberFormatException e) {}
        }

        for (int i = 0; i < integers.size() - 1; i++) {
            for (int z = integers.size() - 1; z > i; z--) {
                if (integers.get(i) > integers.get(z)) {
                    int tmp = integers.get(i);
                    integers.set(i, integers.get(z));
                    integers.set(z, tmp);
                }
            }
        }

        for (int i : integers) System.out.println(i);

    }
}
