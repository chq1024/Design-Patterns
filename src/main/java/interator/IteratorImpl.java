package interator;


/**
 * @author bk
 */
public class IteratorImpl implements Iterator {

    private final String[] arrayString = new String[] {"A","B","C","D"};

    private int index = 0;

    @Override
    public boolean hasNext() {
        if (index >= arrayString.length) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return arrayString[index++];
    }
}
