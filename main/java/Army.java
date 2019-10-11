import exceptions.ArmyOutOfBoundsException;

import java.util.List;

public class Army {
    public static final int MAX_STACKS = 6;
    private List<UnitsStack> stacks;

    public Army(List<UnitsStack> uStacks) throws ArmyOutOfBoundsException {
        stacks = uStacks;
        if (stacks.size() > Army.MAX_STACKS)
            throw new ArmyOutOfBoundsException("Army must contains no more then 6 UnitStacks");
        if (stacks.size() == 0) {
            throw new ArmyOutOfBoundsException("Army must contains at least one UnitStack");
        }
    }

    /**
     * Get UnitsStack by ID in the List of UnitsStack's
     * @param index must be: 0 <= index <= 5
     * @throws ArmyOutOfBoundsException if index is incorrect
     */
    public UnitsStack getUnitsStack(int index) throws ArmyOutOfBoundsException {
        if (index < 0 || index >= stacks.size())
            throw new ArmyOutOfBoundsException("Your index if out of bounds in UnitsStack list");
        return stacks.get(index);
    }
}
