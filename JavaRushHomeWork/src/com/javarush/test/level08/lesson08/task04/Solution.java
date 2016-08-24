package com.javarush.test.level08.lesson08.task04;

import javax.xml.crypto.Data;
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
        map.put("Man", new Date("JULY 1 1980"));
        map.put("Man1", new Date("AUGUST 1 1980"));
        map.put("Man2", new Date("SEPTEMBER 1 1980"));
        map.put("Man3", new Date("OCTOBER 1 1980"));
        map.put("Man4", new Date("DECEMBER 1 1980"));
        map.put("Man5", new Date("MAY 1 1980"));
        map.put("Man6", new Date("APRIL 1 1980"));
        map.put("Man7", new Date("FEBRUARY 1 1980"));
        map.put("Man8", new Date("JANUARY 1 1980"));


        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) iterator.remove();
        }

    }
}
