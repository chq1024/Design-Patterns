package proxy.static_proxy;

import proxy.BasicInterface;
import proxy.BasicInterfaceImpl;

/**
 * @author bk
 */
public class ProxyBasicInterfaceImpl implements BasicInterface {

    private BasicInterfaceImpl basicInterface = new BasicInterfaceImpl();

    @Override
    public String formatString() {
        System.out.println("自定义逻辑");
        return basicInterface.formatString();
    }
}
