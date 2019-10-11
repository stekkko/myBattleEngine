package units;

public class Cyclops extends Unit {
    public Cyclops
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
