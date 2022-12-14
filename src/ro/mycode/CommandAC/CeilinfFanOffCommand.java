package ro.mycode.CommandAC;

import ro.mycode.Command;
import ro.mycode.Electronics.CeilingFan;

public class CeilinfFanOffCommand implements Command {

    CeilingFan ceilingFan;

    public CeilinfFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.off();
    }
    @Override
    public void undo() {
    }
}
