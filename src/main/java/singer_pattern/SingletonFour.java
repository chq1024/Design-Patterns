package singer_pattern;

/**
 * 静态内部类只会在被使用的时候初始化,实现了懒加载
 * @author bk
 */
public class SingletonFour {

    private SingletonFour(){

    }

    public static class InnerSingletonFour {
        public static final SingletonFour SINGLETON_FOUR = new SingletonFour();
    }

    public static SingletonFour getInstance() {
        return InnerSingletonFour.SINGLETON_FOUR;
    }


    public static void main(String[] args) {
        SingletonFour instance1 = SingletonFour.getInstance();
        SingletonFour instance2 = SingletonFour.getInstance();
        System.out.println(instance1 == instance2);
    }
}
