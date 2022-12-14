package ro.mycode.CommandAC;

import ro.mycode.Command;
import ro.mycode.Electronics.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
    @Override
    public void undo() {
        garageDoor.up();
    }
}
