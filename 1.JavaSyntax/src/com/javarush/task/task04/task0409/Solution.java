package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        int s1 = 10 - a;
        int s2 = 10 - b;
        if (abs(s1) > abs(s2))
            System.out.println(b);
        if (abs(s1) < abs(s2))
            System.out.println(a);
        if (abs(s1) == abs(s2))
            System.out.println(a);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}