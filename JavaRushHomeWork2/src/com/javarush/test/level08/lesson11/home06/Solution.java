package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> family = new ArrayList<Human>();
        ArrayList<Human> emptyList = new ArrayList<Human>();

        Human child1 = new Human();
        child1.name = "child1";
        child1.sex = true;
        child1.age = 5;
        child1.children = emptyList;
        family.add(child1);

        Human child2 = new Human();
        child2.name = "child2";
        child2.sex = true;
        child2.age = 6;
        child2.children = emptyList;
        family.add(child2);

        Human child3 = new Human();
        child3.name = "child3";
        child3.sex = false;
        child3.age = 7;
        child3.children = emptyList;
        family.add(child3);

        ArrayList<Human> children = new ArrayList<Human>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human father = new Human();
        father.name = "father";
        father.sex = true;
        father.age = 35;
        father.children = children;
        family.add(father);


        Human mother = new Human();
        mother.name = "mother";
        mother.sex = false;
        mother.age = 34;
        mother.children = children;
        family.add(mother);


        ArrayList<Human> parrents = new ArrayList<Human>();
        parrents.add(father);
        parrents.add(mother);


        Human granFather1 = new Human();
        granFather1.name = "granFather1";
        granFather1.sex = true;
        granFather1.age = 55;
        granFather1.children = parrents;
        family.add(granFather1);


        Human granFather2 = new Human();
        granFather2.name = "granFather2";
        granFather2.sex = true;
        granFather2.age = 56;
        granFather2.children = parrents;
        family.add(granFather2);


        Human granMother1 = new Human();
        granMother1.name = "granMother1";
        granMother1.sex = false;
        granMother1.age = 50;
        granMother1.children = parrents;
        family.add(granMother1);

        Human granMother2 = new Human();
        granMother2.name = "granMother2";
        granMother2.sex = false;
        granMother2.age = 51;
        granMother2.children = parrents;
        family.add(granMother2);

        Iterator<Human> humanIterator = family.iterator();
        while (humanIterator.hasNext()) System.out.println(humanIterator.next());

    }

    public static class Human
    {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

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
