package status;

/**
 * 状态模式,每个状态实现对同做的单独处理,并维护一个上下文类context来触发动作和维护当前状态
 * 在状态类中处理状态的前后扭转
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
