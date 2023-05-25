package status;

/**
 * @author bk
 */
public class Context {

    private Status status;

    public Context() {}

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
        this.status.setContext(this);
    }

    public void agree() {
        this.status.agree();
    }

    public void reject() {
        this.status.reject();
    }

    public void delete() {
        this.status.delete();
    }


}
