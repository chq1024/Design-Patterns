package link;

/**
 * 把总流程交给父级,父级管理抽象部分,即流程部分
 * 下级处理具体的业务逻辑
 * 并且整个流程是链式的,一层一层的处理,不清楚在哪层具体的被处理了
 * @author bk
 */
public abstract class Handler {

    private Integer days;
    private Handler next;

    public Handler(int days) {
        this.days = days;
    }

    public void next(Handler handler) {
        this.next = handler;
    }

    public void submit(LevelRequest request) {
        if (this.days == 0) {
            return;
        }
        if (request.getDays() > days) {
            if (next != null) {
                this.next.submit(request);
                return;
            }
        }
        this.handlerLevel(request);
    }

    public abstract void handlerLevel(LevelRequest request);
}
