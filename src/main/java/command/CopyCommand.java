package command;

/**
 * @author bk
 */
public class CopyCommand implements Command{

    private String params;

    private Receiver receiver;

    public CopyCommand(Receiver receiver,String params) {
        this.params = params;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("自定义逻辑execute");
        receiver.action("copy");
    }
}
