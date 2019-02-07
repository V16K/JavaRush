package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n > 0)
            n = n * 2;
        if (n < 0)
            n = n + 1;
        if (n == 0)
            n = n * 0;
        System.out.println(n);

    }

}