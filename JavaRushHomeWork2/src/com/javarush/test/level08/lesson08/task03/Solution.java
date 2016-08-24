package com.javarush.test.level08.lesson08.task03;

import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++)
        {
            map.put("Key" + i, "Name" + i);
        }

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            if (name.equals(entry.getValue())) count++;
        }

        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        if (map.get(lastName) == null) return 0;
        else return 1;
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Name1"));
        System.out.println(getCountTheSameLastName(map, "Key"));
    }

}
