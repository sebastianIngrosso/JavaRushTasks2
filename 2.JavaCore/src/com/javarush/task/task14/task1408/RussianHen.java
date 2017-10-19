package com.javarush.task.task14.task1408;

/**
 * Created by bohdan on 27.05.2017.
 */
public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 40;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - "+RUSSIA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
