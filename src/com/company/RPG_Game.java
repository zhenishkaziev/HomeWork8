package com.company;

import h.*;

import java.util.Random;

public class RPG_Game {

    public static Random random = new Random();


    public static void start() {
        Boss boss = new Boss(1500, 50, "Танос");

        Warrior warrior = new Warrior(250, 20, "Капитан Америка");
        Medic medic = new Medic(170, 15, "Полярис", 10);
        Magic magic = new Magic(240, 25, "Алая ведьма");
        Berserk berserk = new Berserk(260, 22, "Халк");
        Medic assistant = new Medic(140, 10, "Небула", 5);
        Tank tank = new Tank(300, 15, "Iron Man");
        Thor thor = new Thor(210, 20, "Тор");
        Witcher witcher = new Witcher(250,0,"Сокол");

        Heroes[] heroes = {warrior, medic, magic, berserk, assistant, tank, thor, witcher};
        printStatics(boss, heroes);

        while (!isGameGinish(boss, heroes)) {
            round(boss, heroes);
        }
    }

    private static void round(Boss boss, Heroes[] heroes) {
        if (boss.getHealth() > 0) {
            bossHits(boss, heroes);
        }
        heroesHits(boss, heroes);
        heroesAbility(boss, heroes);
        printStatics(boss, heroes);

    }

    private static void bossHits(Boss boss, Heroes[] heroes) {
        for (Heroes hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setHealth(hero.getHealth() - boss.getDamage());}
        }
    }

    private static void heroesHits(Boss boss, Heroes[] heroes) {
        for (Heroes hero : heroes) {
            if (boss.getHealth() > 0 && hero.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - hero.getDamage());
            }
        }
    }

    private static void heroesAbility(Boss boss, Heroes[] heroes) {
        for (Heroes hero : heroes) {
            if (boss.getHealth() > 0 && hero.getHealth() > 0) {
                hero.applySuperAbility(boss, heroes);
            }

        }
    }

    private static boolean isGameGinish(Boss boss, Heroes[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes win!!!");
            return true;
        }
        boolean allHeroesFead = true;
        for (Heroes hero : heroes) {
            if (hero.getHealth() > 0) {
                allHeroesFead = false;
                break;
            }
        }
        if (allHeroesFead) {
            System.out.println("Boss win!!!");
        }
        return allHeroesFead;
    }

    private static void printStatics(Boss boss, Heroes[] heroes) {
        System.out.println("----------------");
        System.out.println("Boss health: " + boss.getHealth() + "[" + boss.getDamage() + "]");
        for (Heroes hero : heroes) {
            System.out.println(hero.getName() +
                    " " + "Health: " + hero.getHealth() + "[" + hero.getDamage() + "]");
        }
    }
}
