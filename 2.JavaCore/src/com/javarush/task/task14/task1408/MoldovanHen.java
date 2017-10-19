package com.javarush.task.task14.task1408;

/**
 * Created by bohdan on 27.05.2017.
 */
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - "+MOLDOVA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
