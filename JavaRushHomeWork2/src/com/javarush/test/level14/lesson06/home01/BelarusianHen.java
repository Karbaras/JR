package com.javarush.test.level14.lesson06.home01;

/**
 * Created by dvchi on 22.08.2016.
 */
public class BelarusianHen extends Hen
{
    private String country = Country.BELARUS;
    public int getCountOfEggsPerMonth()
    {
        return 10;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
