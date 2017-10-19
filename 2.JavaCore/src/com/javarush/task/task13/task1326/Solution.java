package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args)  {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> spaceman = new ArrayList<>();
        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(conReader.readLine())));
            while (fileReader.ready()){
                spaceman.add(Integer.parseInt(fileReader.readLine()));
            }
            fileReader.close();
        }catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Can't read File");
        }
        Collections.sort(spaceman);
        for (Integer i: spaceman) {
            if(i%2==0)
                System.out.println(i);

        }

    }
}
