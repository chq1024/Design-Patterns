package factory;

import simple_factory.Product;

/**
 * @author bk
 */
public class ProductB implements Product {
    @Override
    public void doSomeThing() {
        System.out.println("do something product B");
    }
}
