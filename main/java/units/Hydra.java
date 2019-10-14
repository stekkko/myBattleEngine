package units;

public class Hydra extends Unit {
    public Hydra() {
        this("Monster", 80, 15, 12, 7, 14, 7);
    }

    private Hydra
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
