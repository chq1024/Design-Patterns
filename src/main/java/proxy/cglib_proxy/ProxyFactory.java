package proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.BasicInterfaceImpl;

import java.lang.reflect.Method;

/**
 * @author bk
 */
public class ProxyFactory implements MethodInterceptor {


    private final BasicInterfaceImpl proxyClazz = new BasicInterfaceImpl();

    public Object createProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.proxyClazz.getClass());
        enhancer.setInterfaces(this.proxyClazz.getClass().getInterfaces());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始执行");
        return methodProxy.invokeSuper(o,objects);
    }
}
