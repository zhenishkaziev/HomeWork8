package h;

public class Berserk extends Heroes {


    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);

    }

    @Override
    public void applySuperAbility(Boss boss, Heroes[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() >0 && heroes[i] == this){
                heroes[i].setDamage(22);
                boss.setHealth(boss.getHealth() - (heroes[i].getDamage() + boss.getDamage()/2));
                System.out.println("Berserk attacks");

        }
        }
        }
    }

