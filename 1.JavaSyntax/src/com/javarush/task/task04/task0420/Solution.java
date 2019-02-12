package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner numb = new Scanner(System.in);
        int a = numb.nextInt();
        int b = numb.nextInt();
        int c = numb.nextInt();
        int z;
        if (a < b) {
            z = b;
            b = a;
            a = z;
        }
        if (b < c) {
            z = b;
            b = c;
            c = z;
        }
        if (a < b) {
            z = b;
            b = a;
            a = z;
        }
        System.out.println(a + " " + b + " " + c);

    }
}
