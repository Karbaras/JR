package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> list = new ArrayList<Human>();

        //granfather
        Human granFa1 = new Human();
        granFa1.name = "Gena";
        granFa1.age = 60;
        granFa1.sex = true;

        list.add(granFa1);

        Human granFa2 = new Human();
        granFa2.name = "Kolia";
        granFa2.age = 60;
        granFa2.sex = true;

        list.add(granFa2);

        //granmother
        Human granMo1 = new Human();
        granMo1.name = "Dusa";
        granMo1.age = 60;
        granMo1.sex = false;

        list.add(granMo1);

        Human granMo2 = new Human();
        granMo2.name = "Ala";
        granMo2.age = 60;
        granMo2.sex = false;

        list.add(granMo2);

        //parents
        Human father = new Human();
        father.name = "Vasia";
        father.age = 35;
        father.sex = true;
        father.father = granFa1;
        father.mother = granMo1;

        list.add(father);

        Human mother = new Human();
        mother.name = "Vera";
        mother.age = 30;
        mother.sex = false;
        mother.father = granFa2;
        mother.mother = granMo2;

        list.add(mother);

        //kids
        Human son1 = new Human();
        son1.name = "son1";
        son1.age = 10;
        son1.sex = true;
        son1.father = father;
        son1.mother = mother;

        list.add(son1);

        Human son2 = new Human();
        son2.name = "son2";
        son2.age = 11;
        son2.sex = true;
        son2.father = father;
        son2.mother = mother;

        list.add(son2);

        Human daughter1 = new Human();
        daughter1.name = "daught1";
        daughter1.age = 13;
        daughter1.sex = false;
        daughter1.father = father;
        daughter1.mother = mother;

        list.add(daughter1);

        for (Human i : list)
        {
            System.out.println(i);
        }

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
