package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < 10; i++) {
            map.put("Key"+i, "Name"+(i > 3 && i < 5 ? 2 : i));
        }

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> listForRemove = new ArrayList<String>();
        for (String s : map.values()) {
            if (list.contains(s)) listForRemove.add(s);
            else list.add(s);
        }

        for (String s : listForRemove) removeItemFromMapByValue(map, s);

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        printMap(map);
        removeTheFirstNameDuplicates(map);
        printMap(map);
    }

    public static void printMap(HashMap<String, String> map)
    {
        for (Map.Entry<String, String> entry : map.entrySet()) System.out.println(entry.getValue());
        System.out.println(map.size());
    }
}
