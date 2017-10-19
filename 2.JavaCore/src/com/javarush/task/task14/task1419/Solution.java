package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try { // 1
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        // 2 IndexOutofBoundsException - тип индекса вышел за допустимые пределы
        try {
            String s="";
            s.charAt(10);
        } catch (IndexOutOfBoundsException   e) {
            exceptions.add(e);
        }

        // 3 NumberFormatException - неверное преобразование строки в числовой формат
        try {
            String s="digital value";
            int a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        // 4 ArrayStoreException - присваивание элементу массива объекта несовместимого типа
        try {
            Object o[] = new String[5];
            o[2] = new Integer(200);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        // 5 Исключение ClassCastException - неверное приведение
        try {
            Object o = new String("Vasya");
            System.out.println((Integer)o);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        // 6 Исключение NegativeArraySizeException - создан массив отрицательного размера
        try
        {
            int[] nNegArray = new int[-5];
        }
        catch(NegativeArraySizeException exv)
        {
            exceptions.add(exv);
        }

        // 7 NullPointerException - неверное использование пустой ссылки
        try
        {
            int[] nNulArray = new int[5];
            nNulArray = null;
            int i = nNulArray.length;
        }
        catch(NullPointerException spc)
        {
            exceptions.add(spc);
        }

        // 8 StringIndexOutOfBounds - попытка использования индекса за пределами строки
        try
        {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        }
        catch(StringIndexOutOfBoundsException btm)
        {
            exceptions.add(btm);
        }

        // 9 IllegalArgumentException
        try {
            throw new IllegalArgumentException("Threw an IllegalArgumentException");
        } catch(IllegalArgumentException sce) {
            exceptions.add(sce);
        }

        // 10
        try{
            FileInputStream fis = null;
            fis = new FileInputStream("B:/myfile.txt");
        }catch(FileNotFoundException fnfe){
           exceptions.add(fnfe);
        }

        try {
            throw new InterruptedException(); // URISyntaxException("", ""); FileNotFoundException(); IOException(); ...
        } catch (InterruptedException e) {
            exceptions.add(e);
        }
    }
}


