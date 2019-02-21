package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;

        while (true) {
            int n = Integer.parseInt(reader.readLine());
            i = i + n;
            if (n == -1) break;
            System.out.println(i);
        }
    }
}
