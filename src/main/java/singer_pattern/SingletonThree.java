package singer_pattern;

import java.lang.reflect.Constructor;

/**
 * 对枚举类做扩展说明
 * 为什么枚举类是单例且安全的
 * 将由下面两个情况说明
 * 1. 反射
 * 2. 序列化/反序列化
 * @author bk
 */
public enum SingletonThree {

    INSTANCE,
    ;

    public void method1(String content) {
        System.out.println(content);
    }
}

class Test {


    public static void main(String[] args) {
//        SingleThree instance = SingleThree.INSTANCE;
//        instance.method1("hello");
        Constructor<?> constructors = null;
        try {
//            protected Enum(String name, int ordinal) {
//                this.name = name;
//                this.ordinal = ordinal;
//            }
            constructors = SingletonThree.class.getDeclaredConstructor(String.class,int.class);
            // error class singer_pattern.Test cannot access a member of class singer_pattern.SingleThree with modifiers "private"
            constructors.setAccessible(true);
            SingletonThree obj1 = (SingletonThree) constructors.newInstance("instance",1);
            SingletonThree obj2 = (SingletonThree) constructors.newInstance("instance",1);
            System.out.println(obj1 == obj2);
            // error java.lang.IllegalArgumentException: Cannot reflectively create enum objects
            // 说明: 无法通过反射创建枚举对象
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        SingletonThree instance = SingletonThree.INSTANCE;
//        SingletonThree.INSTANCE
    }
}
