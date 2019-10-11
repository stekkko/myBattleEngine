package units;

public class Lich extends Unit {
    public Lich
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
