package hsmnzaydn.serkanozaydin.net.EventBus;

import hsmnzaydn.serkanozaydin.net.model.Command;

import java.util.List;

/**
 * Created by hsmnzaydn on 07.12.2017.
 */

public class CommandListEvent {
    private List<Command> commandList;

    public CommandListEvent(List<Command> commandList) {
        this.commandList = commandList;
    }

    public List<Command> getCommandList() {
        return commandList;
    }

    public void setCommandList(List<Command> commandList) {
        this.commandList = commandList;
    }
}