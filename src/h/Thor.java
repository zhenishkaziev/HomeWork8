package h;

import com.company.RPG_Game;

public class Thor extends Heroes {
    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUNNING);
    }

    @Override
    public void applySuperAbility(Boss boss, Heroes[] heroes) {
        boolean randomness = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (randomness){
                System.out.println("Thor stunned boss ");
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage());
                break;
            }
        }
    }
}



