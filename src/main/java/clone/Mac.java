package clone;

/**
 * @author bk
 */
public class Mac extends BaseClazz{

    private String width;

    private String height;

    public Mac(Mac obj) {
        super(obj);
        this.width = obj.width;
        this.height = obj.height;
    }

    @Override
    public BaseClazz clone() {
        return new Mac(this);
    }
}
