package proxy.factory;

import simple_factory.Product;

/**
 * @author bk
 */
public class ProductA implements Product {
    @Override
    public void doSomeThing() {
        System.out.println("do something product A");
    }
}
