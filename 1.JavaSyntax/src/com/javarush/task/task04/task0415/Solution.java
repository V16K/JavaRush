package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if ((a + b) > c || (a + c) > b || (c + b) > a)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");


    }
}