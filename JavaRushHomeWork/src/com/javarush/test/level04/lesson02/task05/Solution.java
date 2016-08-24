package com.javarush.test.level04.lesson02.task05;

/* Подсчитать количество котов
Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильно их количество.
*/

import com.javarush.test.level04.lesson02.task03.Cat;

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat.count = Cat.count++;

        Cat cat2 = new Cat();
        Cat.count = Cat.count++;

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;

    }
}