package proxy.static_proxy;

/**
 * @author bk
 */
public class Application {

    public static void main(String[] args) {
        ProxyBasicInterfaceImpl proxyBasicInterface = new ProxyBasicInterfaceImpl();
        proxyBasicInterface.formatString();
    }
}
