package proxy.factory;

import simple_factory.Product;

/**
 * @author bk
 */
public class BFactory implements Factory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
