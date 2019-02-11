package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s1);

        if (a > 0 && b > 0)
            System.out.println("1");
        else if (a < 0 && b > 0)
            System.out.println("2");
        else if (a < 0 && b < 0)
            System.out.println("3");
        else
            System.out.println("4");
    }
}
