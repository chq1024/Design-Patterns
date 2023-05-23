package simple_factory;

/**
 * 简单工厂: 在于产品的多样化,通过工厂方法根据参数的不同创建不同的产品实例
 * 产品实现产品接口的通用方法,并可添加自定义实现,实现产品的多样化
 * 但简单工厂产品的创建交由了工厂统一处理,导致新增产品需要修改创建产品的方法,没有做到单一原则
 * @author bk
 */
public class Factory {

    public Product createProduct(String typeOf) {
        if ("A".equals(typeOf)) {
            return new ProductA();
        } else if ("B".equals(typeOf)) {
            return new ProductB();
        } else {
            return null;
        }
    }

}
