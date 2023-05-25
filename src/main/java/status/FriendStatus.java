package status;

/**
 * @author bk
 */
public class FriendStatus extends Status{

    @Override
    public void agree() {
        System.out.println("你们已经是好友");
    }

    @Override
    public void reject() {
        System.out.println("错误扭转");
    }

    @Override
    public void delete() {
        System.out.println("很遗憾好友关系解除");
        context.setStatus(new NoStatus());
    }
}
