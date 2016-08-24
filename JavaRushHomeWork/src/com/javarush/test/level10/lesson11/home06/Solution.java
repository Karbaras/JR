package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/


public class Solution
{
    public static void main(String[] args)
    {

        Human man  = new Human("Man");

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private String family;
        private int age;
        private Human mom;
        private Human dad;
        private String city;

        public Human(String name)
        {
            this.name = name;
        }
        public Human(String name, String family)
        {
            this.name = name;
            this.family = family;
        }
        Human(String name, String family, String city)
        {
            this.name = name;
            this.family = family;
            this.city = city;
        }
        Human(int age)
        {
            this.age = age;
        }
        Human(Human mom)
        {
            this.mom = mom;
        }
        Human(Human mom, Human dad)
        {
            this.mom = mom;
            this.dad = dad;
        }
        Human(String name, Human mom)
        {
            this.name = name;
            this.mom = mom;
        }
        Human(String name, String family, Human mom)
        {
            this.name = name;
            this.family = family;
            this.mom = mom;
        }
        Human(String name, String family, Human mom, Human dad)
        {
            this.name = name;
            this.family = family;
            this.mom = mom;
            this.dad = dad;
        }
        Human(String name, String family, int age)
        {
            this.name = name;
            this.family = family;
            this.age = age;
        }

    }
}
