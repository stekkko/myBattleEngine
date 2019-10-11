package units;

public class Skeleton extends Unit {
    public Skeleton
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
