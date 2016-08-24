package com.javarush.test.level14.lesson06.home01;

public class RussianHen extends Hen
{
    private String country = Country.RUSSIA;

    public int getCountOfEggsPerMonth()
    {
        return 40;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
