package bridging;

/**
 * @author bk
 */
public class Application {

    public static void main(String[] args) {
        RefBook book = new RefBook("N100101");
        AbstractClazz abstractClazz = new ExtendAbstractClazz(book,"book");
        abstractClazz.print();
    }
}
