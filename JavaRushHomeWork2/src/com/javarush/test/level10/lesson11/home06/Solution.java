package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        public String firstname;
        public String lastname;
        public int age;
        public int weight;
        public int height;
        public String color;

        public Human(String firstname) {
            this.firstname = firstname;
        }

        public Human(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public Human(String firstname, String lastname, int age) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
        }

        public Human(String firstname, String lastname, int age, int weight) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.weight = weight;
        }

        public Human(String firstname, String lastname, int age, int weight, int height) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String firstname, String lastname, int age, int weight, int height, String color) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.color = color;
        }

        public Human(String firstname, String lastname, String color) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.color = color;
        }

        public Human(int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, int weight, int height, String color) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.color = color;
        }

        public Human(int height, String color) {
            this.height = height;
            this.color = color;
        }

    }
}
