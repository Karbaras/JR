package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        for (int i = 0; i < 9; i++) {
            Date bd = new Date();
            bd.setMonth(i+1);
            map.put("ActionHero" + i, bd);
        }

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            int month = entry.getValue().getMonth();
            if (month > 4 && month < 8) list.add(entry.getKey());
        }

        for (String s : list) map.remove(s);

    }

    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        for (Map.Entry<String, Date> entry : map.entrySet())
        {
            System.out.println(entry.getValue());
        }

        for (int i = 0; i < 10; i++) System.out.print("-");
        System.out.println();

        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> entry : map.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }
}
