package abstract_factory;


/**
 * @author bk
 */
public class FactoryImplB implements Factory {

    @Override
    public Product createProductA() {
        System.out.println("impl B");
        return new AProduct();
    }

    @Override
    public Product createProductB() {
        System.out.println("impl B");
        return new BProduct();
    }
}
