import exceptions.ArmyIsFullException;

import java.util.List;

public class Army {
    public static final int MAX_STACKS = 6;
    private List<UnitsStack> stacks;

    public Army(List<UnitsStack> uStacks) throws ArmyIsFullException {
        stacks = uStacks;
        if (stacks.size() > Army.MAX_STACKS)
            throw new ArmyIsFullException();
    }

    public List<UnitsStack> getUnitStacks() {
        return stacks;
    }
}
