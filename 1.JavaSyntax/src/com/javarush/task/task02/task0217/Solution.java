package com.javarush.task.task02.task0217;

/*
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int x;
        if (c < min(a, b) && c < d) x = c;
        else if (d < c && d < min(a, b)) x = d;
        else x = min(a, b);
        return x;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int x2;
        if (a < b) x2 = a;
        else x2 = b;
        return x2;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}