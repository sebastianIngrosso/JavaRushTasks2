package com.javarush.task.task13.task1318;

/*
Чтение файла
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedReader file = new BufferedReader (new InputStreamReader(new FileInputStream(filename), "windows-1251"));

        while (file.ready()) {
            System.out.println(file.readLine());
        }

        file.close();
        reader.close();



    }
}