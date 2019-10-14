package units;

public class Lich extends Unit {
    public Lich() {
        this("Undead", 50, 15, 15, 12, 17, 10);
    }

    private Lich
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
