package proxy.cglib_proxy;

import proxy.BasicInterfaceImpl;

/**
 * @author bk
 */
public class Application {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        BasicInterfaceImpl proxy = (BasicInterfaceImpl) proxyFactory.createProxy();
        System.out.println(proxy.formatString());
    }
}
