package abstract_factory;


/**
 * @author bk
 */
public class FactoryImplA implements Factory {

    @Override
    public Product createProductA() {
        System.out.println("impl A");
        return new AProduct();
    }

    @Override
    public Product createProductB() {
        System.out.println("impl A");
        return new BProduct();
    }
}
