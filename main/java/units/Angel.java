package units;

public class Angel extends Unit{
    public Angel
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
