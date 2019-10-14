package units;

public class Griffin extends Unit {
    public Griffin() {
        this("Monster", 30, 7, 5, 5, 10, 15);
    }

    private Griffin
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
