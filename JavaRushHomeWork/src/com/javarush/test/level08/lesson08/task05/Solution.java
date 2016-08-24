package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

        for (Map.Entry<String, String> el : map.entrySet())
        {
            System.out.println(el.getKey());
        }

    }

    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<String, String>();

        map.put("fam1", "name1");
        map.put("fam2", "name2");
        map.put("fam3", "name3");
        map.put("fam4", "name4");
        map.put("fam5", "name1");
        map.put("fam6", "name6");
        map.put("fam7", "name7");
        map.put("fam8", "name1");
        map.put("fam9", "name9");
        map.put("fam10", "name1");


        return (HashMap<String, String>) map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copyMap = new HashMap<String, String>(map);

        for (Map.Entry<String, String> recordCopy : copyMap.entrySet())
        {
            int repeatCount = 0;

            for (Map.Entry<String, String> record : map.entrySet())
            {
                if (recordCopy.getValue().equals(record.getValue()))
                {
                    repeatCount++;
                }
            }

            if (repeatCount > 1) removeItemFromMapByValue(map, recordCopy.getValue());
        }

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
}
