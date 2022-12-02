package singer_pattern;

/**
 * 单例-饿汉式
 * 使用静态代码块 初始化对象
 * 私有化构造方法
 * @author chuhq
 */
public class SingerPatternTwo {

    private SingerPatternTwo() {}

    private static SingerPatternTwo singerPatternTwo = null;

    static {
        singerPatternTwo = new SingerPatternTwo();
    }

    public static SingerPatternTwo getInstance() {
        return singerPatternTwo;
    }
}

class TestSingerPatternTwo {

    public static void main(String[] args) {
        SingerPatternTwo instance1 = SingerPatternTwo.getInstance();
        SingerPatternTwo instance2 = SingerPatternTwo.getInstance();
        System.out.println(instance1 == instance2);
    }
}
