package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double i, sum = 0;
        for (i = 0; ; i++) {
            double a = Double.parseDouble(reader.readLine());
            if (a != -1) sum += a;
            else if (a == -1) {
                sum += a + 1;
                break;
            }

        }
        double b = sum / (i);
        System.out.println(b);
    }
}

