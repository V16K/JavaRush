package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numb = reader.readLine();
        String name = reader.readLine();
        System.out.println(name + " захватит мир через " + numb + " лет. Му-ха-ха!");
    }
}