package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner numb = new Scanner(System.in);
        int a = numb.nextInt();
        int b = numb.nextInt();
        int c = Math.min(a, b);
        System.out.println(c);
    }
}