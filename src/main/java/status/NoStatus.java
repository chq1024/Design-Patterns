package status;

/**
 * @author bk
 */
public class NoStatus extends Status{

    @Override
    public void agree() {
        context.setStatus(new FriendStatus());
    }

    @Override
    public void reject() {
        System.out.println("错误扭转");
    }

    @Override
    public void delete() {
        System.out.println("错误扭转");
    }
}
