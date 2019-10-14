package units;

public class Cyclops extends Unit {
    public Cyclops() {
        this("Monster", 85, 20, 15, 18, 26, 10);
    }

    private Cyclops
            (String type
                    , int hitPoints
                    , int attack
                    , int defence
                    , int minDamage
                    , int maxDamage
                    , float initiative) {
        super(type, hitPoints, attack, defence, minDamage, maxDamage, initiative);
    }
}
