import exceptions.StackOutOfBoundsException;

public class UnitsStack {

    public UnitsStack(String type, int count) throws StackOutOfBoundsException {
        this.type = type;
        this.count = count;
        if (count <= 0)
            throw new StackOutOfBoundsException("Stack must contain more then zero units");
        if (count > 999_999)
            throw new StackOutOfBoundsException("Stack is overflowed with units (MaxSize=999_999)");
    }

    private String type;
    private int count;

    public String getType() {
        return type;
    }

    public int getCount() {
        return count;
    }
}
