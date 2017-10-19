package com.javarush.task.task14.task1408;

/**
 * Created by bohdan on 27.05.2017.
 */
public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - "+BELARUS+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
