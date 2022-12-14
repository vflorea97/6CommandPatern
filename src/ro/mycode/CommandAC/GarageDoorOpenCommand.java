package ro.mycode.CommandAC;

import ro.mycode.Command;
import ro.mycode.Electronics.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = new GarageDoor();
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
    @Override
    public void undo() {
        garageDoor.down();
    }
}
