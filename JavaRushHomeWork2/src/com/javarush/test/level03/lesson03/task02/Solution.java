package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        //напишите тут ваш код
        int eur = 10;
        double course = 1.25;
        System.out.println(convertEurToUsd(eur, course));
        eur = 150;
        course = 12.5;
        System.out.println(convertEurToUsd(eur, course));
    }

    public static double convertEurToUsd(int eur, double course){
        //напишите тут ваш код
        return eur * course;
    }
}
