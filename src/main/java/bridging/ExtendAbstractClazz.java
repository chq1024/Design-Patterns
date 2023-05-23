package bridging;

/**
 * @author bk
 */
public class ExtendAbstractClazz extends AbstractClazz {

    // 抽象类扩展
    private String privateSource;

    public ExtendAbstractClazz(RefObj refObj,String privateSource) {
        super(refObj);
        this.privateSource = privateSource;
    }

    @Override
    void print() {
        System.out.println(privateSource);
        this.printUUID();
    }
}
