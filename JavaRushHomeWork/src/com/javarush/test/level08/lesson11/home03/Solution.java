package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        //напишите тут ваш код
        Map<String, String> peopleList = new HashMap<String, String>();

        peopleList.put("fam1", "name1");
        peopleList.put("fam1", "name2");
        peopleList.put("fam3", "name3");
        peopleList.put("fam4", "name4");
        peopleList.put("fam5", "name5");
        peopleList.put("fam6", "name6");
        peopleList.put("fam7", "name6");
        peopleList.put("fam8", "name6");
        peopleList.put("fam9", "name9");
        peopleList.put("fam10", "name10");

        return peopleList;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
