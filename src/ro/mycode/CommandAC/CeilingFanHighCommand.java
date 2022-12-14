package ro.mycode.CommandAC;

import ro.mycode.Command;
import ro.mycode.Electronics.CeilingFan;

public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == ceilingFan.high){
            ceilingFan.high();
        }else if (prevSpeed == ceilingFan.medium){
            ceilingFan.medium();
        }else if (prevSpeed == ceilingFan.low){
            ceilingFan.low();
        }else if (prevSpeed == ceilingFan.off){
            ceilingFan.off();
        }
    }
}
