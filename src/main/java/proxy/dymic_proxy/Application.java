package proxy.dymic_proxy;


import proxy.BasicInterface;

/**
 * @author bk
 */
public class Application {

    public static void main(String[] args) {
        ProxyBasicInterfaceImpl proxyBean = new ProxyBasicInterfaceImpl();
        BasicInterface proxyInstance = proxyBean.getProxyInstance();
        System.out.println(proxyInstance.formatString());
    }
}
