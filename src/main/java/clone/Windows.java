package clone;

/**
 * @author bk
 */
public class Windows extends BaseClazz{

    private String width;

    private String height;

    public Windows(Windows obj) {
        super(obj);
        this.width = obj.width;
        this.height = obj.height;
    }

    @Override
    public BaseClazz clone() {
        return new Windows(this);
    }
}
