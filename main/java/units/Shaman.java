package units;

public class Shaman extends Unit {
    public Shaman() {
        this("People", 40, 12, 10, 7, 12, 10.5f);
    }

    private Shaman
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
