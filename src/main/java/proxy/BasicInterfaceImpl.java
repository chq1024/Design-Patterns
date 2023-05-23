package proxy;


/**
 * @author bk
 */
public class BasicInterfaceImpl implements BasicInterface {
    @Override
    public String formatString() {
        return String.format("hello,%s", "word");
    }
}
