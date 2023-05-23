package abstract_factory;

/**
 * @author bk
 */
public class BProduct implements Product{
    @Override
    public void doSomething() {
        System.out.println("do something B");
    }
}
