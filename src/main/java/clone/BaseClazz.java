package clone;

/**
 * @author bk
 */
public abstract class BaseClazz {
    private String x;

    private String y;

    public BaseClazz(BaseClazz clazz) {
        this.x = clazz.x;
        this.y = clazz.y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public abstract BaseClazz clone();
}
