/**
 * Basic class
 */
public abstract class Unit {

    protected Unit
            (String type
            , int attack
            , int defence
            , int minDamage
            , int maxDamage
            , float initiative) {
        this.type = type;
        this.attack = attack;
        this.defence = defence;
        this.damage = new Damage(minDamage, maxDamage);
        this.initiative = initiative;
    }

    private String type; //TODO make it Enum rather then String
    private int attack;
    private int defence;
    private Damage damage;
    private float initiative;

    private class Damage {
        private Damage(int minDamage, int maxDamage) {
            this.minDamage = minDamage;
            this.maxDamage = maxDamage;
        }

        private int minDamage;
        private int maxDamage;

        // * Getters
        public int getMinDamage() {
            return minDamage;
        }
        public int getMaxDamage() {
            return maxDamage;
        }
    }

    // ** Getters
    public String getType() {
        return type;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefence() {
        return defence;
    }
    public Damage getDamage() {
        return damage;
    }
    public float getInitiative() {
        return initiative;
    }
}
