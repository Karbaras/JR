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

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human gfa1 = new Human();
        gfa1.name = "gfa1";
        gfa1.sex = true;
        gfa1.age = 55;

        Human gfa2 = new Human();
        gfa2.name = "gfa2";
        gfa2.sex = true;
        gfa2.age = 56;

        Human gmo1 = new Human();
        gmo1.name = "gmo1";
        gmo1.sex = false;
        gmo1.age = 57;

        Human gmo2 = new Human();
        gmo2.name = "gmo2";
        gmo2.sex = false;
        gmo2.age = 58;

        Human father = new Human();
        father.name = "father";
        father.sex = true;
        father.age = 30;
        father.father = gfa1;
        father.mother = gmo1;

        Human mother = new Human();
        mother.name = "mother";
        mother.sex = false;
        mother.age = 31;
        mother.father = gfa2;
        mother.mother = gmo2;

        Human son1 = new Human();
        son1.name = "son1";
        son1.sex = true;
        son1.age = 10;
        son1.father = father;
        son1.mother = mother;

        Human dout1 = new Human();
        dout1.name = "dout1";
        dout1.sex = false;
        dout1.age = 11;
        dout1.father = father;
        dout1.mother = mother;

        Human dout2 = new Human();
        dout2.name = "dout2";
        dout2.sex = false;
        dout2.age = 12;
        dout2.father = father;
        dout2.mother = mother;

        System.out.println(gfa1);
        System.out.println(gfa2);
        System.out.println(gmo1);
        System.out.println(gmo2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(dout1);
        System.out.println(dout2);

    }

    public static class Human
    {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

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
