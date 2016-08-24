package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();

        while (true) {
            String s = bufferedReader.readLine();
            arrayList.add(s);
            if (s.equals("exit")) break;
        }

        PrintWriter fileWriter = new PrintWriter(new FileWriter(arrayList.get(0)));
        for (int i = 1; i < arrayList.size(); i++) fileWriter.println(arrayList.get(i));

        bufferedReader.close();
        fileWriter.close();
    }
}
