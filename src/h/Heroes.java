package h;

public abstract class Heroes extends GameEnity implements HavingSuperAbility {
    private SuperAbility superAbility;

    public Heroes(int health, int damage, String name, SuperAbility superAbility) {
        super(health, damage, name);
        this.superAbility = superAbility;
    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }
}
