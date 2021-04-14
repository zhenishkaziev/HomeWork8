package h;

import com.company.RPG_Game;

public class Warrior extends Heroes {

    public Warrior(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Heroes[] heroes) {
        int cef = RPG_Game.random.nextInt(5) + 2;
        boss.setHealth(boss.getHealth() - cef * this.getDamage());
        System.out.println(this.getName() +" his critical: " + cef * this.getDamage());
    }
}
