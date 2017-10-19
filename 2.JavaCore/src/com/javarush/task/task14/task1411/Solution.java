package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        String s;
        while (true)
        {
            s = reader.readLine();
            //создаем объект, пункт 2
            if (s.equals("user")) {
                person = new Person.User();
                doWork(person); //вызываем doWork
                continue;
            }

            if (s.equals("loser")) {
                person = new Person.Loser();
                doWork(person); //вызываем doWork
                continue;
            }

            if (s.equals("coder")) {
                person = new Person.Coder();
                doWork(person); //вызываем doWork
                continue;
            }

            if (s.equals("proger")) {
                person = new Person.Proger();
                doWork(person); //вызываем doWork
                continue;
            }

            break; // User input other string, break.
        }
    }
        /*while (true) {
            key = reader.readLine();

            //создаем объект, пункт 2
            switch (key) {
                case "user":
                    person = new Person.User();
                    break;
                case "loser":
                    person = new Person.Loser();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
                case "proger":
                    person = new Person.Proger();
                    break;
                default:
                    return;
            }
*//*
            if (key.equals("user"))
                doWork(new Person.User()); //вызываем doWork
            else if (key.equals("loser"))
                doWork(new Person.Loser());
            else if (key.equals("coder"))
                doWork(new Person.Coder());
            else if (key.equals("proger"))
                doWork(new Person.Coder());
        }
    }*/


    public static void doWork(Person person) {
        // пункт 3
        if(person instanceof Person.User)
            ((Person.User) person).live();
        else if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        else if(person instanceof Person.Coder)
            ((Person.Coder) person).coding();
        else if(person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
    }
}
