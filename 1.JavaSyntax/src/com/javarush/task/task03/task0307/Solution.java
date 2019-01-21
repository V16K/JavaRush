package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zergling = new Zerg();
        zergling.name = "zerg_unit1";
        Zerg owerlord = new Zerg();
        owerlord.name = "zerg_unit2";
        Zerg Overseer = new Zerg();
        Overseer.name = "zerg_unit3";
        Zerg Drone = new Zerg();
        Drone.name = "zeg_unit4";
        Zerg Hydralisk = new Zerg();
        Hydralisk.name = "zerg_unit5";

        Protoss Zealot = new Protoss();
        Zealot.name = "toss_unit1";
        Protoss Stalker = new Protoss();
        Stalker.name = "toss_unit2";
        Protoss Sentry = new Protoss();
        Sentry.name = "toss_unit3";

        Terran Marine = new Terran();
        Marine.name = "Terran_unit1";
        Terran Marauder = new Terran();
        Marauder.name = "Terran_unit2";
        Terran Reaper = new Terran();
        Reaper.name = "Terran_unit_3";
        Terran Ghost = new Terran();
        Ghost.name = "Terran_unit4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
