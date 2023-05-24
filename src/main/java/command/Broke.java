package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bk
 */
public class Broke {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void place() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
