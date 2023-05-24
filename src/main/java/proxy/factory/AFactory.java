package proxy.factory;

import simple_factory.Product;

/**
 * @author bk
 */
public class AFactory implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
