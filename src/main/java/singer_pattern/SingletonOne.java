package singer_pattern;


/**
 * 利用java类加载机制，静态变量优先加载初始化到常量池中，再进制构造方法被外部直接调用，通过静态方法调用获得初始化实例
 * @author bk
 */
public class SingletonOne {

    private static final SingletonOne INSTANCE = new SingletonOne();

    private SingletonOne() {

    }

    public static SingletonOne getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
//        SingletonOne one = SingletonOne.INSTANCE;
//        SingletonOne two = SingletonOne.INSTANCE;
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();
    }
}