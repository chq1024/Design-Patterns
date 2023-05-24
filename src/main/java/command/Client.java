package command;

/**
 * 命令模式:主要有三个对象  命令抽象类,接收者,执行者
 *
 * @author bk
 */
public class Client {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command copy = new CopyCommand(receiver,"str1");
        Command replace = new ReplaceCommand(receiver);

        Broke broke = new Broke();
        broke.addCommand(copy);
        broke.addCommand(replace);
        broke.place();
    }
}
