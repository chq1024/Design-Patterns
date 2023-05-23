package factory;

import simple_factory.Product;

/**
 * 工厂模式相比于简单工厂,实现了单一原则
 * 即创建产品时由专属工厂创建
 *
 * @author bk
 */
public interface Factory {

    Product createProduct();
}
