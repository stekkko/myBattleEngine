import exceptions.ArmyOutOfBoundsException;
import exceptions.StackOutOfBoundsException;
import units.Angel;
import units.Unit;

import java.util.List;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        List<UnitsStack> stack1 = new ArrayList<>();
        List<UnitsStack> stack2 = new ArrayList<>();

        try {
            // Justice Army
            stack1.add(new UnitsStack("Crossbowman", 110));
            stack1.add(new UnitsStack("Angel", 2));
            stack1.add(new UnitsStack("Shaman", 30));
            stack1.add(new UnitsStack("Griffin", 12));
            stack1.add(new UnitsStack("Fury", 56));
            stack1.add(new UnitsStack("Hydra", 5));

            // Evil Army
            stack2.add(new UnitsStack("BoneDragon", 10));
            stack2.add(new UnitsStack("Devil", 1));
            stack2.add(new UnitsStack("Cyclops", 15));
            stack2.add(new UnitsStack("Lich", 88));
            stack2.add(new UnitsStack("Skeleton", 356));
        } catch (StackOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        Army army1;
        Army army2;
        try {
            army1 = new Army(stack1);
            army2 = new Army(stack2);
        } catch (ArmyOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return;
        }

        Unit angel = new Angel();

        // unit tests
        String type = angel.getType();
        int atk = angel.getAttack();
        int def = angel.getDefence();
        int hp = angel.getHitPoints();
        Unit.Damage dmg = angel.getDamage();
        float init = angel.getInitiative();


        // army tests
        try {

            String a1s1type = army1.getUnitsStack(0).getType();
            String a2s1type = army2.getUnitsStack(0).getType();

            int a2s2count = army2.getUnitsStack(1).getCount();
            int a2s3count = army2.getUnitsStack(2).getCount();

            System.out.println(a1s1type.equals("Crossbowman"));
            System.out.println(a2s1type.equals("BoneDragon"));
            System.out.println(a2s2count == 1);
            System.out.println(a2s3count == 15);


        } catch (ArmyOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
