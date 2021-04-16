package h;

import com.company.RPG_Game;

public class Tank extends Heroes {

    public Tank(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_HEROES);
    }

    @Override
    public void applySuperAbility(Boss boss, Heroes[] heroes) {


        for (int i = 0; i < heroes.length; i++) {
            int h = boss.getDamage() * 20 / 100;
            this.setHealth(getHealth() - h);
            heroes[i].setHealth(heroes[i].getHealth() + h);
        }
    }
}
                     //  Пример кода вариант №2

//            if (heroes[i].getHealth() > 0){
//                heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage()*20/100);
//                this.setHealth(this.getHealth() - boss.getDamage()*20/100);
//                System.out.println("Tank move " + boss.getDamage()/5);
//            }
