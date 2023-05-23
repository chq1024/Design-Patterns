package adapter;

/**
 * @author bk
 */
public class ChineseEuropeSocketAdapter extends EuropeSocketImpl implements ChineseSocket{

    @Override
    public String useChineseSocket() {
        System.out.println("使用欧洲标准");
        return useEuropeSocket();
    }
}
