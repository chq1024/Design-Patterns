package abstract_factory;

/**
 * 相比较工厂模式,抽象工厂提供不同工厂分别对产品创建的不同实现
 * 视觉站在工厂层面
 * 这样做的好处比如可以保持工厂下产品的某种相似性
 */
public interface Factory {

    Product createProductA();

    Product createProductB();
}
