package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();

        for (int i = 1; i <= 10; i++)
        {
            map.put("i" + i, "i" + i + 1);
        }

        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext())
        {
            if (iterator.next().getValue().equals(name)) {count++;}
        }

        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext())
        {
            if (iterator.next().getKey().equals(lastName)) {count++;}
        }

        return count;

    }
}
