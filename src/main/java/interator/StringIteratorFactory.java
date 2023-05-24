package interator;

/**
 * @author bk
 */
public class StringIteratorFactory implements IteratorFactory{
    @Override
    public Iterator createIterator() {
        return new IteratorImpl();
    }
}
