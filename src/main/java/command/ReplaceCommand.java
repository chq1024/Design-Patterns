package command;

/**
 * @author bk
 */
public class ReplaceCommand implements Command{

    private Receiver receiver;

    public ReplaceCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("自定义逻辑2");
        receiver.action("replace");
    }
}
