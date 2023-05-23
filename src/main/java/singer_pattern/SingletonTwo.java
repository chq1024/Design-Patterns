package singer_pattern;

/**
 * @author bk
 */
public class SingletonTwo {

    private static SingletonTwo instance1 = null;
    // volatile关键字禁止指令重排，即让流程按照正常顺序执行，此时instance2初始化后指向被分配的内存
    // 此时锁释放，内存已被写入，读时instance2不为null，直接返回
    private volatile static SingletonTwo instance2 = null;

    private SingletonTwo(){

    }

    public synchronized SingletonTwo getInstance1() {
        if (instance1 == null) {
            instance1 = new SingletonTwo();
        }
        return instance1;
    }

    public static SingletonTwo getInstance2() {
        if (instance2 == null) {
            synchronized (SingletonTwo.class) {
                if (instance2 == null) {
                    // * 这里可能出现指令重排现象
                    // 正常的流程： 开辟内存，初始化对象，分配内存（指向）
                    // 错误的流程： 开辟内存，分配内存，初始化对象
                    // 错误分析：在开辟内存后，将对象指向了被分配的内存，结果导致instance2指向了null的内存
                    //         此时锁被释放，另一个线程判断到instance2为null,再次进入new
                    instance2 = new SingletonTwo();
                }
            }
        }
        return instance2;
    }
}
