package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();

        int s1 = name1.length();
        String name2 = reader.readLine();
        int s2 = name2.length();


        if (name1 == name2)
            System.out.println("Имена идентичны");
        else if (name1 != name2 && s1 == s2)
            System.out.println("Длины имен равны");
    }
}
