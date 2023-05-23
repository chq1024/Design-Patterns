package abstract_factory;

/**
 * @author bk
 */
public class AProduct implements Product{
    @Override
    public void doSomething() {
        System.out.println("do something A");
    }
}
