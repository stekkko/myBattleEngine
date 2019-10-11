package units;

public class Crossbowman extends Unit {
    public Crossbowman
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
