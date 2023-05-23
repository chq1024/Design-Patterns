package proxy.dymic_proxy;

import proxy.BasicInterface;
import proxy.BasicInterfaceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author bk
 */
public class ProxyBasicInterfaceImpl {

    public BasicInterfaceImpl basicInterface = new BasicInterfaceImpl();

    public BasicInterface getProxyInstance() {
        return (BasicInterface) Proxy.newProxyInstance(basicInterface.getClass().getClassLoader(), basicInterface.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("自定义逻辑");
                return method.invoke(basicInterface,args);
            }
        });
    }
}
