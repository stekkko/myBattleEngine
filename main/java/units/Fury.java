package units;

public class Fury extends Unit {
    public Fury() {
        this("Elf", 16, 5, 3, 5, 7, 16);
    }

    private Fury
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
