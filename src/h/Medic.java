package h;

public class Medic extends Heroes {
    private int healPoint;

    public Medic(int health, int damage, String name, int healPoint) {
        super(health, damage, name, SuperAbility.HEALT);
        this.healPoint = healPoint;
    }

    public int getHealPoint() {
        return healPoint;
    }

    public void setHealPoint(int healPoint) {
        this.healPoint = healPoint;
    }

    @Override
    public void applySuperAbility(Boss boss, Heroes[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i] != this) {
                heroes[i].setHealth(heroes[i].getHealth() + healPoint);

            }

        }
    }
}
