package units;

public class Crossbowman extends Unit {

    public Crossbowman() {
        this("People", 10, 4, 4, 2, 8, 8);
    }

    private Crossbowman
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
