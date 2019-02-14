package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int pol = 0;
        int otr = 0;


        if (num1 < 0)
            otr++;
        if (num2 < 0)
            otr++;
        if (num3 < 0)
            otr++;
        System.out.println("количество отрицательных чисел: " + otr);

        if (num1 > 0)
            pol++;
        if (num2 > 0)
            pol++;
        if (num3 > 0)
            pol++;
        System.out.println("количество положительных чисел: " + pol);

    }
}
