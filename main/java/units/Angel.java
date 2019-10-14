package units;

public class Angel extends Unit{
    public Angel() {
        this("People", 180, 27, 27, 45, 45, 11);
    }

    private Angel
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
