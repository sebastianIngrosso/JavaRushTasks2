package com.javarush.task.task14.task1408;

/**
 * Created by bohdan on 27.05.2017.
 */
public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - "+UKRAINE+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
