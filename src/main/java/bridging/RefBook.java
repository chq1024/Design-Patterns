package bridging;

/**
 * 具体实现类
 * @author bk
 */
public class RefBook implements RefObj{

    private String nid;

    public RefBook(String nid) {
        this.nid = nid;
    }

    @Override
    public String printUUID() {
        return nid;
    }
}
