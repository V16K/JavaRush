package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Woman w = new Woman();
        Cat c = new Cat();
        c.owner = w;
        Dog d = new Dog();
        d.owner = w;
        Fish f = new Fish();
        f.owner = w;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
