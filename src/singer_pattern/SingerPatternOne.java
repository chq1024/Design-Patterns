package singer_pattern;

/**
 * 单例模式-饿汉式
 * 单例: 全局获取唯一对象
 * 饿汉式: 类加载时创建对象
 * @author chuhq
 */
public class SingerPatternOne {

    private SingerPatternOne() {}
    private static SingerPatternOne instance = new SingerPatternOne();

    public static SingerPatternOne getInstance() {
        return instance;
    }
}

class TestSingerPattern {

    public static void main(String[] args) {
        SingerPatternOne singerPatternOne1 = SingerPatternOne.getInstance();
        SingerPatternOne singerPatternOne2 = SingerPatternOne.getInstance();
        System.out.println(singerPatternOne2 == singerPatternOne1);
    }
}
