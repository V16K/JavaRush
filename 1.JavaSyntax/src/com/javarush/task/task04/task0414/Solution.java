package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String age = reader.readLine();
        int a = Integer.parseInt(age);

        if (a % 4 == 0 && (a % 100 != 0 || (a % 100 == 0 && a % 400 == 0))) {
            int x = 366;
            System.out.print("количество дней в году:" + " " + x);
        } else {
            int x = 365;
            System.out.print("количество дней в году:" + " " + x);
        }
    }
}