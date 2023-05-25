package status;

/**
 * @author bk
 */
public abstract class Status {

    public Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void agree();

    public abstract void reject();

    public abstract void delete();
}
