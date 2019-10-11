package units;

public class BoneDragon extends Unit {
    public BoneDragon
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
