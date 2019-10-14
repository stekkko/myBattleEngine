package units;

public class Devil extends Unit {
    public Devil() {
        this("Demon", 166, 27, 25, 36, 66, 11);
    }

    private Devil
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
