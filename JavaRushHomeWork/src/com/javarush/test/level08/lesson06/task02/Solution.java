package com.javarush.test.level08.lesson06.task02;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list)
    {
        Date startDate = new Date();
        for (int i = 0; i < 10000; i++) {list.add(new Object());}
        Date currentDate = new Date();
        System.out.println("insert10000: " + (currentDate.getTime() - startDate.getTime()));
    }

    public static void get10000(List list)
    {
        Date startDate = new Date();

        for (int i = 0; i < 10000; i++) {list.get(i);}
        Date currentDate = new Date();
        System.out.println("get10000: " + (currentDate.getTime() - startDate.getTime()));

    }

    public static void set10000(List list)
    {
        Date startDate = new Date();

        for (int i = 0; i < 10000; i++) {list.set(i, new Object());}
        Date currentDate = new Date();
        System.out.println("set10000: " + (currentDate.getTime() - startDate.getTime()));

    }

    public static void remove10000(List list)
    {
        Date startDate = new Date();

        for (int i = 0; i < 10000; i++) {list.remove(0);}
        Date currentDate = new Date();
        System.out.println("remove10000: " + (currentDate.getTime() - startDate.getTime()));

    }
}
