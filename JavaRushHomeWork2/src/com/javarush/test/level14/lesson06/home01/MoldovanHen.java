package com.javarush.test.level14.lesson06.home01;

/**
 * Created by dvchi on 22.08.2016.
 */
public class MoldovanHen extends Hen
{
    private String country = Country.MOLDOVA;
    public int getCountOfEggsPerMonth()
    {
        return 20;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
