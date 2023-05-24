package interator;

/**
 * @author bk
 */
public class Application {

    public static void main(String[] args) {
        StringIteratorFactory stringIteratorFactory = new StringIteratorFactory();
        for (Iterator iterator = stringIteratorFactory.createIterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
