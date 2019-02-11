package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double min = Double.parseDouble(s);
        min = min % 5;

        if (min < 3.0)
            System.out.println("зелёный");
        else if (min >= 3.0 && min < 4.0)
            System.out.println("жёлтый");
        else
            System.out.println("красный");
    }
}