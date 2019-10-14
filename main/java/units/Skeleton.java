package units;

public class Skeleton extends Unit {
    public Skeleton() {
        this("Undead", 5, 1, 2, 1, 1, 10);
    }

    private Skeleton
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
