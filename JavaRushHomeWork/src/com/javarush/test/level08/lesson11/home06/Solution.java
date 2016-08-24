package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        Human boy1 = new Human();
        boy1.name = "Boy1";
        boy1.sex = true;
        boy1.age = 5;
        System.out.println(boy1.toString());

        Human boy2 = new Human();
        boy2.name = "Boy2";
        boy2.sex = true;
        boy2.age = 7;
        System.out.println(boy2.toString());

        Human girl1 = new Human();
        girl1.name = "Girl1";
        girl1.sex = false;
        girl1.age = 10;
        System.out.println(girl1.toString());

        Human father = new Human();
        father.name = "Father";
        father.sex = true;
        father.age = 35;
        father.children.add(boy1);
        father.children.add(boy2);
        father.children.add(girl1);
        System.out.println(father.toString());

        Human mother = new Human();
        mother.name = "Mother";
        mother.sex = false;
        mother.age = 30;
        mother.children.add(boy1);
        mother.children.add(boy2);
        mother.children.add(girl1);
        System.out.println(mother.toString());

        Human granfa1 = new Human();
        granfa1.name = "Granfa1";
        granfa1.sex = true;
        granfa1.age = 71;
        granfa1.children.add(father);
        System.out.println(granfa1.toString());

        Human granfa2 = new Human();
        granfa2.name = "Granfa2";
        granfa2.sex = true;
        granfa2.age = 69;
        granfa2.children.add(mother);
        System.out.println(granfa2.toString());

        Human granma1 = new Human();
        granma1.name = "Granma1";
        granma1.sex = true;
        granma1.age = 65;
        granma1.children.add(father);
        System.out.println(granma1.toString());

        Human granma2 = new Human();
        granma2.name = "Granma2";
        granma2.sex = true;
        granma2.age = 60;
        granma2.children.add(mother);
        System.out.println(granma2.toString());


    }

    public static class Human
    {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<Human>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
