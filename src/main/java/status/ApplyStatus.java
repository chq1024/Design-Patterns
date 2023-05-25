package status;

/**
 * @author bk
 */
public class ApplyStatus extends Status{
    @Override
    public void agree() {
        System.out.println("恭喜成为好友");
        context.setStatus(new FriendStatus());
    }

    @Override
    public void reject() {
        System.out.println("很遗憾好友关系解除");
        context.setStatus(new NoStatus());
    }

    @Override
    public void delete() {
        System.out.println("错误扭转");
    }
}
