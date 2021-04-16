package h;

import com.company.RPG_Game;

public class Witcher extends Heroes {

    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.REVITALIZATION);
    }

    @Override
    public void applySuperAbility(Boss boss, Heroes[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()<=0){
              heroes[i].setHealth(heroes[i].getHealth() + this.getHealth());
              this.setHealth(0);
                System.out.println("Life return");
                break;
            }

        }

    }
}
