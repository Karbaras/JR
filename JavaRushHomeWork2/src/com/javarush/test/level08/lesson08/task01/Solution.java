package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        Set<String> set = new HashSet<String>();
        set.add("лавка");
        set.add("лес");
        set.add("лесник");
        set.add("лавочник");
        set.add("лето");
        set.add("лошадь");
        set.add("лаванда");
        set.add("лиса");
        set.add("ластик");
        set.add("лагранж");
        set.add("лакрица");
        set.add("лист");
        set.add("лось");
        set.add("лампа");
        set.add("лазарет");
        set.add("лев");
        set.add("лик");
        set.add("лак");
        set.add("лук");
        set.add("лиана");

        return (HashSet<String>) set;

    }
}
