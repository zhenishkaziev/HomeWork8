package h;

import com.company.RPG_Game;

public class Magic extends Heroes {

    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Heroes[] heroes) {

        int coef = RPG_Game.random.nextInt(9)+2;
        for (int i = 0; i < heroes.length; i++) {
            if ( this.getHealth() >0){
               heroes[i].setDamage(coef + heroes[i].getDamage());
            }
        }
        System.out.println("Magic answer" + coef);

        }
    }

