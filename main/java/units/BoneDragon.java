package units;

public class BoneDragon extends Unit {
    public BoneDragon() {
        this("Undead", 150, 27, 28, 15, 30, 11);
    }

    private BoneDragon
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
